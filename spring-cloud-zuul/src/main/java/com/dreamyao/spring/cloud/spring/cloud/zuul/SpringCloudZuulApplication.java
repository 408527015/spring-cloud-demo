package com.dreamyao.spring.cloud.spring.cloud.zuul;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class SpringCloudZuulApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringCloudZuulApplication.class, args);
        new SpringApplicationBuilder(SpringCloudZuulApplication.class).web(true).run(args);
    }
}
