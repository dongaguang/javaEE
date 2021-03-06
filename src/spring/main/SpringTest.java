package spring.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.service.Performer;
import spring.service.impl.Audience;

public class SpringTest {
	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
			Performer p = (Performer)ac.getBean("duke");
			p.perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
