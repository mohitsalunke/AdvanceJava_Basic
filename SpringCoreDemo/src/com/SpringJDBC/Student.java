package com.SpringJDBC;

public class Student {

	private int studid;
	private String sname;
	private String email;
	private String qualification;
	private int exp;
	
	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		System.out.println(studid);
		this.studid = studid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		System.out.println(sname);
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		System.out.println(email);
		this.email = email;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		System.out.println(qualification);
		this.qualification = qualification;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		System.out.println(exp);
		this.exp = exp;
	}
	
	public Student(String sname, String email, String qualification, int exp) {
		super();
		
		this.sname = sname;
		this.email = email;
		this.qualification = qualification;
		this.exp = exp;
	}
	
	public Student() {
		super();
	}
	
	@Override
	public String toString() {
		return "Student [studid=" + studid + ", sname=" + sname + ", email=" + email + ", qualification="
				+ qualification + ", exp=" + exp + "]";
	}
	
}
