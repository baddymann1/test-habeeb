package com.arca.testhabeeb.receivers;

import com.arca.framework.messaging.annotations.QueueListener;
import com.arca.framework.messaging.events.testhabeeb.TestHabeebEvent;
import com.arca.framework.messaging.receivers.MessageReceiver;
import com.arca.framework.messaging.services.MessagingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@QueueListener(value = "com.arca.framework.messaging.events.testhabeeb.TestHabeebEvent")
public class TestHabeebReceiver implements MessageReceiver<TestHabeebEvent> {

    private Logger LOGGER = LoggerFactory.getLogger(TestHabeebReceiver.class);

    @Autowired
    private MessagingService messagingService;


    @Override
    public void process(final TestHabeebEvent message){
        LOGGER.info("Received an event of type [{}]", message);
        messagingService.broadcast(new TestHabeebEvent());
    }

}
