package com.SpringJDBC;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("SpringJdbc.xml");
     StudentDao sd=(StudentDao) ctx.getBean("sdao");
     int status=sd.saveStudent(new Student("shradha", "ms@gmail.com","BHMS",2));
    	System.out.println("rows updated "+ status);
    	
    	ctx.close();
	}

}
