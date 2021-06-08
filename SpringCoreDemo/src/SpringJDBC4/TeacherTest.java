package SpringJDBC4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeacherTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx=new ClassPathXmlApplicationContext("SpringJDBC4.xml");
		TeacherDao tdao=ctx.getBean(TeacherDao.class);
		System.out.println("Teacher name = "+tdao.getTeacherName(2));
		
		System.out.println("Teacher count = "+tdao.getTeacherCount());
		
		Teacher teacher= tdao.getTeacherObject(3);
		System.out.println("Teacher id is : "+ teacher.getTid());
		System.out.println("Teacher name is : "+ teacher.getTname());
		System.out.println("teacher address is : "+ teacher.getTaddress());
	}
	

}
