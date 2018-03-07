package com.changhong.cloud.javarestsample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * 描述: swagger配置类
 * 与Spring MVC程序配合组织出强大RESTful API文档
 * 让维护文档和修改代码整合为一体
 * 可以让我们在修改代码逻辑的同时方便的修改文档说明
 * 时间:2018-03-05 16:54
 * 作者:yjph83
 */
@Configuration
//@EnableSwagger2
public class Swagger2 {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.changhong.cloud.javarestsample.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建RESTful APIs")
                .description("更多Spring Boot2 初次使用，我就是来试试的！")
                .termsOfServiceUrl("http://www.iteye.com/")
                .version("1.0.0")
                .build();
    }
}
