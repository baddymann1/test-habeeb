package com.arca.framework.messaging.events.testhabeeb;

import com.arca.framework.messaging.events.Event;

public class TestHabeebEvent extends Event {


    public TestHabeebEvent(){
        super(Level.AUDIT_IN_TRANSACTION_ONLY);
    }

}
