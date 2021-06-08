package Autowiring;

public class Person {

	private int pid;
	private String pname;
	private School school;
	
	public Person() {
		
	}
	
	public Person(int pid, String pname, School school) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.school = school;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", school=" + school + "]";
	}
	
	

	
	
	
}
