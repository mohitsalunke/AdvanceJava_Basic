package Autowiring;

public class School {
	
	private int sid;
	private String sname;
	
	
	public School() {
		
	}

	@Override
	public String toString() {
		return "School [sid=" + sid + ", sname=" + sname + "]";
	}

	public School(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
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
	

}
