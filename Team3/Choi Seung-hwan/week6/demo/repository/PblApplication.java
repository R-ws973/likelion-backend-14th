package com.example.demo.repository;

import com.example.demo.service.MemberService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class PblApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(PblApplication.class, args);
		context.getBean(MemberService.class);
	}

}
