package Basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctx=new ClassPathXmlApplicationContext("Springbasic.xml");
IWorld hw= (IWorld) ctx.getBean("helloworld");

IWorld hw1= (IWorld) ctx.getBean("byeworld");


hw.getMessage();
hw1.getMessage();
System.out.println(hw);
System.out.println(hw1);
	}

}
