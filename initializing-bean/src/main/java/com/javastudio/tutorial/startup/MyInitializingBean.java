package com.javastudio.tutorial.startup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MyInitializingBean implements InitializingBean {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyInitializingBean.class);

    @Autowired
    private Environment environment;

    @Override
    public void afterPropertiesSet() throws Exception {
        LOGGER.info("MyInitializingBean#afterPropertiesSet");
        Arrays.stream(environment.getDefaultProfiles()).forEach(LOGGER::info);
    }
}
