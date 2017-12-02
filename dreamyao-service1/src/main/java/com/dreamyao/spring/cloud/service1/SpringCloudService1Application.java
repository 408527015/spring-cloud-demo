package com.dreamyao.spring.cloud.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Stone
 * @version 1.0.0
 * @date 2017/10/27
 */
@EnableHystrixDashboard
//@SpringBootApplication(exclude = {
//        DataSourceAutoConfiguration.class,
////        HibernateJpaAutoConfiguration.class, //如果用了Hibernate
//        DataSourceTransactionManagerAutoConfiguration.class
//})
//@EnableDiscoveryClient
//@EnableCircuitBreaker
@ComponentScan(basePackages = {"com.dreamyao.spring.cloud"})
@SpringCloudApplication
//@MapperScan("com.dreamyao.spring.cloud.*.dao")
public class SpringCloudService1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudService1Application.class, args);
    }
}
