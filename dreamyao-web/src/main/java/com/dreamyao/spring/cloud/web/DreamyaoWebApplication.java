package com.dreamyao.spring.cloud.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Stone
 * @version 1.0.0
 * @date 2017/11/23
 */
@EnableDiscoveryClient
@SpringBootApplication
public class DreamyaoWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DreamyaoWebApplication.class, args);
    }
}
