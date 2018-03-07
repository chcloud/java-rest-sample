package com.changhong.cloud.javarestsample;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
@MapperScan(basePackages = "com.changhong.cloud.*.*")
public class JavaRestSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaRestSampleApplication.class, args);
	}
}
