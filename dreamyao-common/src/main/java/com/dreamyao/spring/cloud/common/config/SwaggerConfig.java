package com.dreamyao.spring.cloud.common.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author BruceLong
 * @version 1.0.0
 * @date 2017/12/12
 */
@Configuration
@EnableSwagger2
@ConditionalOnClass(ApiInfoBuilder.class)
@ConditionalOnProperty("dreamyao.swagger.enable")
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.dreamyao.spring.cloud"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("使用Swagger2构建RESTful APIs")
                .description("更多相关文章请关注：http://blog.dreamyao.com/")
                .termsOfServiceUrl("http://blog.dreamyao.com/")
                .contact(new Contact("BruceLong","http://blog.dreamyao.com/","brucelong@dreamyao.com"))
                .version("1.0.0")
                .build();
    }
}
