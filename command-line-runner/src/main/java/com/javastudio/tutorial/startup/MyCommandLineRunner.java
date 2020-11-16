package com.javastudio.tutorial.startup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyCommandLineRunner.class);

    public void run(String... args) throws Exception {
        LOGGER.info("Here is going to write the arguments: ");
        Arrays.stream(args).forEach(LOGGER::info);
    }
}
