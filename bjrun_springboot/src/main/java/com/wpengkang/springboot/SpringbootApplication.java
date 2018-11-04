package com.wpengkang.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 入口程序
 * @author wpengkang
 *
 */
@SpringBootApplication
@MapperScan(basePackages="com.wpengkang.springboot.dao")
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
