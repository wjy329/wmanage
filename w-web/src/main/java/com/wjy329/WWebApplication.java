package com.wjy329;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ServletComponentScan
@MapperScan(basePackages = {"com.wjy329.wshiro.dao"})
public class WWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WWebApplication.class, args);
	}

}

