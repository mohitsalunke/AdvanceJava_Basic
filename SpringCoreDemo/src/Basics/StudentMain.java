package Basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx=new ClassPathXmlApplicationContext("Springbasic.xml");
		Student obj=(Student) ctx.getBean("S3");
		System.out.println(obj);
	}

}
