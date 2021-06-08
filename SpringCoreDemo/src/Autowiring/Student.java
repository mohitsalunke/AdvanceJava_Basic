package Autowiring;

public class Student {

	private int sid;
	private String sname;
	Batch batch;
	Address address;
	
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", batch=" + batch + ", address=" + address + "]";
	}
	public Student() {
		super();
	}
	public Student(int sid, String sname, Batch batch, Address address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.batch = batch;
		this.address = address;
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
	public Batch getBatch() {
		return batch;
	}
	public void setBatch(Batch batch) {
		this.batch = batch;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
