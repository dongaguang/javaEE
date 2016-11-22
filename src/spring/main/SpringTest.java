package spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.service.Performer;

public class SpringTest {
	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
			Performer perform = (Performer)ac.getBean("duke");
			perform.perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
