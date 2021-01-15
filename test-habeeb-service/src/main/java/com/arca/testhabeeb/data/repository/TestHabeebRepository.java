package com.arca.testhabeeb.data.repository;

import com.arca.framework.data.repository.DSLJpaRepository;
import com.arca.testhabeeb.data.entities.TestHabeeb;
import org.springframework.stereotype.Repository;


@Repository
public interface TestHabeebRepository extends DSLJpaRepository<TestHabeeb, String> {

}