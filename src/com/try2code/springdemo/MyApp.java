package com.try2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		
		// load the spring configuration file
				ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("applicationContext.xml");
				
				// retrieve bean from spring container
				BaseballCoach theCoach = context.getBean("myCoach", BaseballCoach.class);
				
				System.out.println(theCoach.getFortune());
				
				context.close();
				
				
				ClassPathXmlApplicationContext contextt = 
						new ClassPathXmlApplicationContext("applicationContext.xml");
				
				TennisCoach tennisCoach = contextt.getBean("myTennisCoach", TennisCoach.class);
				
				System.out.println(tennisCoach.getFortune());
				
				context.close();
	}

}
