package com.dac.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MAIN {
	
	// SPRING CONTAINER
	public static ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
	
	public static void main(String[] args) {
		
		Project ref = (Project)context.getBean("p1");
		System.out.println(ref.getDept());
		//System.out.println(ref.getEmp().getName());
	}
}
