package com.dallasgutauckis.jbot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.stereotype.Component;

@SpringBootApplication(scanBasePackages = "com.dallasgutauckis.jbot")
public class JBotApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(JBotApplication.class)
                .run(args);
    }
}