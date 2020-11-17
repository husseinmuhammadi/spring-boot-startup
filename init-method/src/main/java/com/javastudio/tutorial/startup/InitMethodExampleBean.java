package com.javastudio.tutorial.startup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import java.util.Arrays;

public class InitMethodExampleBean {
    private static final Logger LOGGER = LoggerFactory.getLogger(InitMethodExampleBean.class);

    @Autowired
    private Environment environment;

    private void init() {
        Arrays.stream(environment.getDefaultProfiles()).map(profile -> "---" + profile).forEach(LOGGER::info);
    }
}
