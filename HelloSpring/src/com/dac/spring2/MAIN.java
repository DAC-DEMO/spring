package com.dac.spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MAIN {
	
	// SPRING CONTAINER
	public static ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
	
	public static void main(String[] args) {
		
		Project ref = (Project)context.getBean("project");
		System.out.println(ref.getDept());
		
		//System.out.println(ref.getEmp().getName());
	}
}
