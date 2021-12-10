package dk.skat.es.util;

import java.io.Serializable;

public enum MessageType implements Serializable {
	
    INBOUND_REQUEST("INBOUND_REQUEST"), INBOUND_RESPONSE("INBOUND_RESPONSE"), 
    OUTBOUND_REQUEST("OUTBOUND_REQUEST"), OUTBOUND_RESPONSE("OUTBOUND_RESPONSE");
    
    private final String value;
    
    private MessageType(String value) {
    	this.value = value;
    }
    
    public String getValue() {
    	return this.value;
    }
}
