package com.camel.spring_camel_microservice.component;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class SimpleTimer extends RouteBuilder {
    @Override
    public void configure() throws Exception {

        from("timer:simple-timer?period=10000")
                .routeId("simple-timer-id")
                .setBody(constant("Hello World"))
                .log(LoggingLevel.INFO, "${body}"); //log inbuild endpoint for camel
    }
}
