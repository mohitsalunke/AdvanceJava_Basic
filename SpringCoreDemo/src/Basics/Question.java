package Basics;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Question {

	private int id;
	private String name;
	private List<String> answer;
	
	public Question() {
		super();
	}

	public Question(int id, String name, List<String> answer) {
		super();
		this.id = id;
		this.name = name;
		this.answer = answer;
	}
	
	public void displayInfo()
	{
		System.out.println(id +" "+name);
		System.out.println("Answer");
		for(String s:answer)
		{
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Springbasic.xml");
		Question obj=(Question) ctx.getBean("q");
		obj.displayInfo();
	}
	
	
	
	
}
