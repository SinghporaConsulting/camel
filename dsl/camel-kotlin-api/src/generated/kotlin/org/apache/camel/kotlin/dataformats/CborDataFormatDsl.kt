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
package org.apache.camel.kotlin.dataformats

import java.lang.Class
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import org.apache.camel.kotlin.CamelDslMarker
import org.apache.camel.kotlin.DataFormatDsl
import org.apache.camel.model.dataformat.CBORDataFormat

public fun DataFormatDsl.cbor(i: CborDataFormatDsl.() -> Unit) {
  def = CborDataFormatDsl().apply(i).def
}

@CamelDslMarker
public class CborDataFormatDsl {
  public val def: CBORDataFormat

  init {
    def = CBORDataFormat()}

  public fun id(id: String) {
    def.id = id
  }

  public fun objectMapper(objectMapper: String) {
    def.objectMapper = objectMapper
  }

  public fun useDefaultObjectMapper(useDefaultObjectMapper: Boolean) {
    def.useDefaultObjectMapper = useDefaultObjectMapper.toString()
  }

  public fun useDefaultObjectMapper(useDefaultObjectMapper: String) {
    def.useDefaultObjectMapper = useDefaultObjectMapper
  }

  public fun unmarshalType(unmarshalType: Class<out Any>) {
    def.unmarshalType = unmarshalType
  }

  public fun collectionType(collectionType: Class<out Any>) {
    def.collectionType = collectionType
  }

  public fun useList(useList: Boolean) {
    def.useList = useList.toString()
  }

  public fun useList(useList: String) {
    def.useList = useList
  }

  public fun allowUnmarshallType(allowUnmarshallType: Boolean) {
    def.allowUnmarshallType = allowUnmarshallType.toString()
  }

  public fun allowUnmarshallType(allowUnmarshallType: String) {
    def.allowUnmarshallType = allowUnmarshallType
  }

  public fun prettyPrint(prettyPrint: Boolean) {
    def.prettyPrint = prettyPrint.toString()
  }

  public fun prettyPrint(prettyPrint: String) {
    def.prettyPrint = prettyPrint
  }

  public fun allowJmsType(allowJmsType: Boolean) {
    def.allowJmsType = allowJmsType.toString()
  }

  public fun allowJmsType(allowJmsType: String) {
    def.allowJmsType = allowJmsType
  }

  public fun enableFeatures(enableFeatures: String) {
    def.enableFeatures = enableFeatures
  }

  public fun disableFeatures(disableFeatures: String) {
    def.disableFeatures = disableFeatures
  }
}