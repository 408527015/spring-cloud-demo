//package com.dreamyao.spring.cloud.service1.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
///**
// * @author Stone
// * @version 1.0.0
// * @date 2017/11/21
// */
//@Configuration
//@EnableWebMvc //启用Spring MVC
//@ComponentScan("com.dreamyao.spring.cloud") //启用组件扫描
//public class WebConfig extends WebMvcConfigurerAdapter{
//
//    //配置JSP视图解析器
//    @Bean
//    public ViewResolver viewResolver(){
//        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        resolver.setPrefix("/WEB-INF/views/");
//        resolver.setSuffix(".jsp");
//        resolver.setExposeContextBeansAsAttributes(true);
//        return resolver;
//    }
//
//    //配置静态资源的处理
//    @Override
//    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
//        configurer.enable();
//    }
//}
