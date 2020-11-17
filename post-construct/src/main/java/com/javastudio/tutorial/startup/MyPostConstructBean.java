package com.javastudio.tutorial.startup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MyPostConstructBean {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyPostConstructBean.class);

    @PostConstruct
    void init() {
        LOGGER.info("@PostConstruct");
    }
}
