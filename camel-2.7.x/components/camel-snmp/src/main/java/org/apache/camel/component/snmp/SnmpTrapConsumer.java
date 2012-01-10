/**
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
package org.apache.camel.component.snmp;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.impl.DefaultConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.snmp4j.CommandResponder;
import org.snmp4j.CommandResponderEvent;
import org.snmp4j.PDU;
import org.snmp4j.Snmp;
import org.snmp4j.TransportMapping;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.GenericAddress;
import org.snmp4j.smi.TcpAddress;
import org.snmp4j.smi.UdpAddress;
import org.snmp4j.transport.DefaultTcpTransportMapping;
import org.snmp4j.transport.DefaultUdpTransportMapping;

public class SnmpTrapConsumer extends DefaultConsumer implements CommandResponder {

    private static final Logger LOG = LoggerFactory.getLogger(SnmpTrapConsumer.class);
    
    private SnmpEndpoint endpoint;
    private Address listenGenericAddress;
    private Snmp snmp;
    private TransportMapping transport;

    public SnmpTrapConsumer(SnmpEndpoint endpoint, Processor processor) {
        super(endpoint, processor);
        this.endpoint = endpoint;
    }
    
    @Override
    protected void doStart() throws Exception {
        super.doStart();

        // load connection data only if the endpoint is enabled
        if (LOG.isInfoEnabled()) {
            LOG.info("Starting trap consumer on " + this.endpoint.getAddress());
        }

        this.listenGenericAddress = GenericAddress.parse(this.endpoint.getAddress());

        // either tcp or udp
        if ("tcp".equals(endpoint.getProtocol())) {
            this.transport = new DefaultTcpTransportMapping((TcpAddress)this.listenGenericAddress);
        } else if ("udp".equals(endpoint.getProtocol())) {
            this.transport = new DefaultUdpTransportMapping((UdpAddress)this.listenGenericAddress);
        } else {
            throw new IllegalArgumentException("Unknown protocol: " + endpoint.getProtocol());
        }

        this.snmp = new Snmp(transport);
        this.snmp.addCommandResponder(this);
        
        // listen to the transport
        if (LOG.isDebugEnabled()) {
            LOG.debug("Starting trap consumer on " + endpoint.getAddress() + " using " + endpoint.getProtocol() + " protocol");
        }
        this.transport.listen();
        LOG.info("Started trap consumer on " + endpoint.getAddress() + " using " + endpoint.getProtocol() + " protocol");
    }

    @Override
    protected void doStop() throws Exception {
        // stop listening to the transport
        if (this.transport != null && this.transport.isListening()) {
            if (LOG.isDebugEnabled()) {
                LOG.debug("Stopping trap consumer on " + this.endpoint.getAddress());
            }
            this.transport.close();
            LOG.info("Stopped trap consumer on " + this.endpoint.getAddress());
        }
        
        super.doStop();
    }

    public void processPdu(CommandResponderEvent event) {
        PDU pdu = event.getPDU();
        // check PDU not null
        if (pdu != null) {
            processPDU(pdu);
        } else {
            LOG.debug("Received invalid trap PDU: " + pdu);
        }
    }
    
    public void processPDU(PDU pdu) {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Received trap event for " + this.endpoint.getAddress() + " : " + pdu);
        }
        Exchange exchange = endpoint.createExchange(pdu);
        try {
            getProcessor().process(exchange);
        } catch (Exception e) {
            getExceptionHandler().handleException(e);
        }
    }
}
