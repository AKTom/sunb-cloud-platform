package com.sun.platform;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegistryCenterApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(RegistryCenterApplication.class)
                .web(true).run(args);

    }
}
