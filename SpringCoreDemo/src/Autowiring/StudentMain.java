package Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("SpringAutowiring.xml");
		Student sobj=(Student) ctx.getBean("s1");
		System.out.println(sobj);
	}

}
