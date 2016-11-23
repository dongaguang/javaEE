package spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.service.Performer;

public class SpringTest {
	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
			Performer perform = (Performer)ac.getBean("duke1");
			perform.perform();
//			Performer imt = (Performer)ac.getBean("instrumentalist");
//			imt.perform();
			
//			Performer oneManBand = (Performer)ac.getBean("oneManBand");
//			oneManBand.perform();
//			Performer oneManBand1 = (Performer)ac.getBean("oneManBand1");
//			oneManBand1.perform();
//			Performer oneManBand2 = (Performer)ac.getBean("oneManBand2");
//			oneManBand2.perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
