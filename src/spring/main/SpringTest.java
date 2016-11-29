package spring.main;

import java.text.DecimalFormat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.service.Performer;

public class SpringTest {
	public static void main(String[] args) {
		try {
			DecimalFormat df = new DecimalFormat("#0.00");
			System.out.println(df.format(11111111111.1111));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
