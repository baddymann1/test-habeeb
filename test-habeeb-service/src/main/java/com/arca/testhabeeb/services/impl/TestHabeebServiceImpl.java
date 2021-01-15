package com.arca.testhabeeb.services.impl;

import com.arca.framework.dataweb.services.impl.AbstractCRUDServiceImpl;
import com.arca.testhabeeb.data.entities.TestHabeeb;
import com.arca.testhabeeb.services.TestHabeebService;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class TestHabeebServiceImpl extends AbstractCRUDServiceImpl<TestHabeeb> implements TestHabeebService {

    private Logger LOGGER = LoggerFactory.getLogger(TestHabeebServiceImpl.class);

    @Override
    public TestHabeeb doTestHabeeb(TestHabeeb testHabeeb) {
        LOGGER.info("Calling doTestHabeeb: [{}]", testHabeeb.getId());
        return super.create(testHabeeb);
    }


}
