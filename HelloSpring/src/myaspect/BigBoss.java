package myaspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class BigBoss {
	
	public void actionPreprcess() {
		System.out.println("PRE PROCESS");
	}
	
	
	public void actionPostProcess() {
		System.out.println("POST PROCESS");
	}
	
	
	public void actionPreAndPost(ProceedingJoinPoint joinPoint) {
		long startTime = System.currentTimeMillis();
		
		
		try {
			joinPoint.proceed();
			
			long endTime = System.currentTimeMillis();
			
			System.out.println("TIME TAKEN :: " + (endTime- startTime) + " :: ms");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
