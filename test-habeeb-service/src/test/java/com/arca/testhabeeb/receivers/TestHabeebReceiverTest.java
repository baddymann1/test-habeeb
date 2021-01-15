package com.arca.testhabeeb.receivers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;
import com.arca.framework.messaging.events.testhabeeb.TestHabeebEvent;
import com.arca.framework.messaging.services.MessagingService;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.isA;
import static org.assertj.core.api.Assertions.assertThat;


@RunWith(MockitoJUnitRunner.class)
public class TestHabeebReceiverTest {

    @Mock
    private MessagingService messagingService;
    @InjectMocks
    private TestHabeebReceiver underTest;


    @Test
    public void process(){
        underTest.process(new TestHabeebEvent());
        verify(messagingService).broadcast(isA(TestHabeebEvent.class));
    }

}
