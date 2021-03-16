package com.sp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionDemo2Application {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(DependencyInjectionDemo2Application.class, args);
		
		Test test=(Test) ac.getBean("test");
		System.out.println(test.showRooms());		
	}
}
