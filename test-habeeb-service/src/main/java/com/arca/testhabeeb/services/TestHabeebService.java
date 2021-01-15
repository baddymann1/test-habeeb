package com.arca.testhabeeb.services;

import com.arca.framework.dataweb.services.CRUDService;
import com.arca.testhabeeb.data.entities.TestHabeeb;


public interface TestHabeebService extends CRUDService<TestHabeeb> {

    TestHabeeb doTestHabeeb(TestHabeeb testHabeeb);

}
