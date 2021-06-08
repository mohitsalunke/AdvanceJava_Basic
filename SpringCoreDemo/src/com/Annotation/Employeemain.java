package com.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employeemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx=new ClassPathXmlApplicationContext("AnnotationDemo.xml");
		Employee emp=ctx.getBean("employee",Employee.class);
		System.out.println(emp);
		
	}

}
