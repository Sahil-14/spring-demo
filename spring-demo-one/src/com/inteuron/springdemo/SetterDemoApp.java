package com.inteuron.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
		public static void main(String args[]) {
            // load the spring config file
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

			//retrive bean from spring container
			CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
			//call the method on the bean
			System.out.println(theCoach.getDailyFortune());
			System.out.println(theCoach.getDailyWorkout());
			
			//call literal value
			// close the context
			context.close();
		}
}
 