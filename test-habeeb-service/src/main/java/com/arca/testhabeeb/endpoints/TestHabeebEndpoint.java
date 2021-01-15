package com.arca.testhabeeb.endpoints;

import com.arca.framework.data.services.ConversionService;
import com.arca.framework.web.exceptions.WebServiceExceptionCode;
import com.arca.framework.web.utils.WebValidationUtils;
import com.arca.testhabeeb.api.TestHabeebApiService;
import com.arca.testhabeeb.data.entities.TestHabeeb;
import com.arca.testhabeeb.models.SATestHabeeb;
import com.arca.testhabeeb.services.TestHabeebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Objects;

import static org.springframework.http.ResponseEntity.ok;

@Component
public class TestHabeebEndpoint implements TestHabeebApiService {

    @Autowired
    private TestHabeebService testHabeebService;
    @Autowired
    private ConversionService conversionService;

    @Override
    public ResponseEntity<SATestHabeeb> doTestHabeeb(final SATestHabeeb testHabeeb) {
        WebValidationUtils.validateNotNull(testHabeeb, "TestHabeeb");

        return ok(conversionService.convert(
                testHabeebService.doTestHabeeb(
                        conversionService.convert(testHabeeb, TestHabeeb.class)),
                SATestHabeeb.class));
    }


    @Override
    public ResponseEntity<SATestHabeeb> doTestHabeebGet() {

        SATestHabeeb sa = new SATestHabeeb();
        sa.setId("This is the id");
        sa.setDescription("This is the description");
        return ok(sa);
    }
}
