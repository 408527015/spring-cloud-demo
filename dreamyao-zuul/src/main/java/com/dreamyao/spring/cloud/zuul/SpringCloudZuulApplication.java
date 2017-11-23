package com.dreamyao.spring.cloud.zuul;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Stone
 * @version 1.0.0
 * @date 2017/10/27
 */
@EnableZuulProxy
@SpringCloudApplication
public class SpringCloudZuulApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringCloudZuulApplication.class).web(true).run(args);
    }
}
