package com.backend14.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.backend14.demo.package2.MemberService;

@SpringBootApplication
public class PblApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(PblApplication.class, args);

        String[] listNames = context.getBeanDefinitionNames();
		for (String listName : listNames) {
			System.out.println("name=" + listName);
		}
    }
}
