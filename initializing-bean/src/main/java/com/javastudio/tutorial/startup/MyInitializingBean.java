package com.javastudio.tutorial.startup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MyInitializingBean implements InitializingBean {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyInitializingBean.class);

    @Override
    public void afterPropertiesSet() throws Exception {
        LOGGER.info("MyInitializingBean#afterPropertiesSet");
    }
}
