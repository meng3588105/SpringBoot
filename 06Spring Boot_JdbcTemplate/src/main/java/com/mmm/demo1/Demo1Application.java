package com.mmm.demo1;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;

/**
 * 使用@SpringBootApplication注解，指定这是一个SpringBoot的应用程序
 */
@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		//启动程序
		SpringApplication.run(Demo1Application.class, args);
	}

/**
 * 第二种方式@Bean
 */

	@Bean
	public HttpMessageConverters fastJsonHttpMessageConverters(){

	//01.定义一个Converter  转化消息的对象
		FastJsonHttpMessageConverter fastconverter =new FastJsonHttpMessageConverter();
	//02.增加fastjson的配置信息
		FastJsonConfig config =new FastJsonConfig();
	//设置格式化特性
		config.setSerializerFeatures(SerializerFeature.PrettyFormat);
	//03.转换coverter中增加配置信息
		fastconverter.setFastJsonConfig(config);
		HttpMessageConverter<?> converter=fastconverter;
	//04.将converter添加到converters中   并返回
		return new HttpMessageConverters(converter);




	}
}
