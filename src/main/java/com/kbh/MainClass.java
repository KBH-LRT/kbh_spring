package com.kbh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// 设置Component扫描路径
@ComponentScan(basePackages = { "com.kbh.logic", "com.kbh.controller", "com.kbh.dao", "com.kbh.dto", "com.kbh.service",
		"com.kbh.system.base.dto" })
public class MainClass {

	public static void main(String[] args) {
		SpringApplication.run(MainClass.class, args);
	}

}
