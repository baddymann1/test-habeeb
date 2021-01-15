package com.arca.testhabeeb.endpoints;

import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;
import com.arca.framework.data.services.ConversionService;
import com.arca.testhabeeb.data.entities.TestHabeeb;
import com.arca.testhabeeb.models.SATestHabeeb;
import com.arca.testhabeeb.services.TestHabeebService;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestHabeebEndpointTest {

    @Mock
    private TestHabeebService testHabeebService;
    @Mock
    private ConversionService conversionService;
    @InjectMocks
    private TestHabeebEndpoint underTest;

    @Test
    public void doTestHabeeb() {
        SATestHabeeb saTestHabeeb = new SATestHabeeb();
        SATestHabeeb expectedTestHabeeb = new SATestHabeeb();
        TestHabeeb testHabeeb = new TestHabeeb();
        when(conversionService.convert(saTestHabeeb, TestHabeeb.class)).thenReturn(testHabeeb);
        when(testHabeebService.doTestHabeeb(testHabeeb)).thenReturn(testHabeeb);
        when(conversionService.convert(testHabeeb, SATestHabeeb.class)).thenReturn(expectedTestHabeeb);

        ResponseEntity<SATestHabeeb> response = underTest.doTestHabeeb(saTestHabeeb);
        assertThat(expectedTestHabeeb).isEqualTo(response.getBody());
        assertThat(200).isEqualTo(response.getStatusCode().value());
    }


    @Test
    public void doTestHabeebGet() {
        ResponseEntity<SATestHabeeb> response = underTest.doTestHabeebGet();
        assertThat(response.getBody()).isNotNull();
        assertThat(200).isEqualTo(response.getStatusCode().value());
    }
}
