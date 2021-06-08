package Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class personMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx=new ClassPathXmlApplicationContext("SpringAutowiring.xml");
		Person pobj=(Person) ctx.getBean("p3");
		System.out.println(pobj);
	}

}
