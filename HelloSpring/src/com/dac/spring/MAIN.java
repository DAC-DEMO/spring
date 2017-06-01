package com.dac.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MAIN {
	
	// SPRING CONTAINER
	public static ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
	public static void main(String[] args) {
		
		Employee emp = (Employee)context.getBean("first1");
		emp.setName("Hello");
		
		Employee emp1 = (Employee)context.getBean("first1");
		System.out.println(emp1.getName());
	}
}
