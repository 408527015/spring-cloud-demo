package com.dreamyao.spring.cloud.spring.cloud.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringCloudEurekaApplication.class).web(true).run(args);
    }
}
