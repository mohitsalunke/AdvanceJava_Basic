package SpingLifeCycle;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Autowiring.Driver;


public class BankMain {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("LifeCycle.xml");
		Bank bobj=(Bank) ctx.getBean("bank");
		System.out.println(bobj);
		
	}

		
	

}
