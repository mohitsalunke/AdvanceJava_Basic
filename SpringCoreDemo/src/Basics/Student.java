package Basics;

public class Student {

	private int sid;
	private String sname;
	private Address adress;
	
	public Student() {
		
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public Student(int sid, String sname, Address adress) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", adress=" + adress + "]";
	}
	
	

	
	
	
	
}
