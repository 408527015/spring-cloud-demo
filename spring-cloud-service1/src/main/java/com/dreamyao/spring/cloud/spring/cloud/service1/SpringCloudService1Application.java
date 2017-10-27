package com.dreamyao.spring.cloud.spring.cloud.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author stone
 * @since 2017/10/27
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudService1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudService1Application.class, args);
	}
}
