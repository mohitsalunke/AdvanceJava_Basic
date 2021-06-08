package JavaBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employeemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfigDemo.class);
		Employee emp=ctx.getBean(Employee.class);
		System.out.println(emp);
		
	}

}
