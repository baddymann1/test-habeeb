package com.arca.testhabeeb;


import com.arca.framework.common.utils.FrameworkConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({FrameworkConstants.BASE_PACKAGE})
@EnableAutoConfiguration
@EnableConfigurationProperties
public class TestHabeebApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestHabeebApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(TestHabeebApplication.class, args);
        LOGGER.info("TestHabeeb application has successfully started.");
    }

}
