package day2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MAIN {

	static ApplicationContext context = new ClassPathXmlApplicationContext("day2.xml");
	
	public static void main(String[] args) {
		
		System.out.println("Hello world");
		PostDao postDao = (PostDao)context.getBean("postDao");
		postDao.updatePost();
		
	}
	
}
