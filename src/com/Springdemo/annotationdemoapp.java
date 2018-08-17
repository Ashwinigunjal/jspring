package com.Springdemo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class annotationdemoapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
	
		Coach thecoach = context.getBean("tennisCoach",Coach.class);
		System.out.println(thecoach.theTennisCoach());
		System.out.println(thecoach.getFortune());
		context.close();
	}

}
