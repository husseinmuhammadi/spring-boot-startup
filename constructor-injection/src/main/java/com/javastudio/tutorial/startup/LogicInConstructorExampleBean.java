package com.javastudio.tutorial.startup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class LogicInConstructorExampleBean {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogicInConstructorExampleBean.class);

    private final Environment environment;

    public LogicInConstructorExampleBean(Environment environment) {
        this.environment = environment;
        Arrays.stream(environment.getDefaultProfiles()).map(profile -> "---" + profile).forEach(LOGGER::info);
        Arrays.stream(environment.getActiveProfiles()).map(profile -> "---" + profile).forEach(LOGGER::info);
    }
}
