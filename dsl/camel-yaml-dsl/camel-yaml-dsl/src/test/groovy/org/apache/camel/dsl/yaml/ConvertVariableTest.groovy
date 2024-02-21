/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.dsl.yaml

import org.apache.camel.component.mock.MockEndpoint
import org.apache.camel.dsl.yaml.support.YamlTestSupport
import org.apache.camel.model.ConvertVariableDefinition
import org.junit.jupiter.api.Assertions

class ConvertVariableTest extends YamlTestSupport {

    def "convert-header-to"() {
        setup:
            loadRoutes '''
                - from:
                    uri: "direct:start"
                    steps:    
                      - convertVariableTo:
                          name: foo  
                          type: "java.lang.String"
                          charset: "UTF8"
                      - to: "mock:result"
            '''

            withMock('mock:result') {
                expectedVariableReceived("foo", 'Hello World')
            }
        when:
            context.start()

            withTemplate {
                withVariable("foo", "Hello World")
                to('direct:start').send()
            }
        then:
            context.routeDefinitions.size() == 1

            with(context.routeDefinitions[0].outputs[0], ConvertVariableDefinition) {
                name == 'foo'
                type == 'java.lang.String'
                charset == 'UTF8'
            }

            MockEndpoint.assertIsSatisfied(context)
    }

    def "convert-variable-another-to"() {
        setup:
        loadRoutes '''
                - from:
                    uri: "direct:start"
                    steps:
                      - convertVariableTo:
                          name: foo
                          toName: bar
                          type: "java.lang.String"
                          charset: "UTF8"
                      - to: "mock:result"
            '''

        withMock('mock:result') {
            expectedVariableReceived("foo", 'test')
        }
        when:
        context.start()

        withTemplate {
            to('direct:start').withVariable("foo", 'test'.bytes).send()
        }
        then:
        context.routeDefinitions.size() == 1

        with(context.routeDefinitions[0].outputs[0], ConvertVariableDefinition) {
            name == 'foo'
            toName == 'bar'
            type == 'java.lang.String'
            charset == 'UTF8'
        }

        MockEndpoint.assertIsSatisfied(context)
    }

    def "Error: kebab-case: convert-variable-to"() {
        when:
        var route = '''
                - from:
                    uri: "direct:start"
                    steps:    
                      - convert-variable-to:
                          name: foo  
                          type: "java.lang.String"
                          charset: "UTF8"
                      - to: "mock:result"
            '''

        withMock('mock:result') {
            expectedVariableReceived("foo", 'Hello World')
        }
        then:
        try {
            loadRoutes(route)
            Assertions.fail("Should have thrown exception")
        } catch (e) {
            Assertions.assertTrue(e.message.contains("additional properties"))
        }
    }
}
