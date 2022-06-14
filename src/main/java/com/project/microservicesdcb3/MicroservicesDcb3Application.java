package com.project.microservicesdcb3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroservicesDcb3Application {

    public static void main(String[] args) {

        SpringApplication.run(MicroservicesDcb3Application.class, args);

    }

}
