package Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctx= new ClassPathXmlApplicationContext("SpringAutowiring.xml");
Driver dobj=(Driver) ctx.getBean("driver");
System.out.println(dobj);
dobj.vehicle.drive();
	}

}
