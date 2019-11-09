package com.qi.qi.chapter2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring4all.swagger.EnableSwagger2Doc;

@EnableSwagger2Doc
@SpringBootApplication
public class Chapter2Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapter2Application.class, args);
	}

}
