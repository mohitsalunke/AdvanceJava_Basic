package com.SpringJDBC2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

  public class JDBCTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Circle cobj=new JDBCDaoImpl().getCircleById(1);
		System.out.println(cobj.getName());
	}

}
