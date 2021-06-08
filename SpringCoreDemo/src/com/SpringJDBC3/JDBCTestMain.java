package com.SpringJDBC3;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class JDBCTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("SpringJDBCCircle.xml");
		JDBCDaoImpl2 dao=ctx.getBean(JDBCDaoImpl2.class);
	/*	Circle cobj=dao.getCircleById(1);
		System.out.println(cobj.getName());*/
		
		//Get whole values of object
	/*	Circle2 circle= dao.getCircleObject(2);
		System.out.println("Circle id is : "+ circle.getId());
		System.out.println("Circle id is : "+ circle.getName());*/
		
	/*	Circle2 circle1=new Circle2(6,"c3");
		dao.insertCircleObj(circle1);
	System.out.println("Circle count is" + dao.getCircleCount());
	System.out.println("Circle name = "+ dao.getCircleName(2));*/
	//dao.createTriangleTable();
	
		//For getting whole table values at a time
		List<Circle2> circlelist=dao.getCircleObjectList();
		for(Circle2 clist: circlelist)
		{
			System.out.println("circle2 id "+ clist.getId());
			System.out.println("circle2 name "+clist.getName());
		}
		
		List<Circle2> circlelist1=dao.getAllCircleObjectUsingResultSetExtractor();
		for(Circle2 clist: circlelist1)
		{
			System.out.println("circle2 id "+ clist.getId());
			System.out.println("circle2 name "+clist.getName());
		}
	
	}

}
