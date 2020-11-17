package com.javastudio.tutorial.startup.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class EventListenerExampleBean {
    private static final Logger LOGGER = LoggerFactory.getLogger(EventListenerExampleBean.class);

    @EventListener
    public void onApplicationEvent(ApplicationReadyEvent event) {
        LOGGER.info("ApplicationListener#onApplicationEvent()");
        ConfigurableApplicationContext applicationContext = event.getApplicationContext();
        Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(LOGGER::info);
    }
}
