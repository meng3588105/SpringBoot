package com.mmm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 使用@SpringBootApplication注解，指定这是一个SpringBoot的应用程序
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//启动程序
		SpringApplication.run(Application.class, args);
	}
}
