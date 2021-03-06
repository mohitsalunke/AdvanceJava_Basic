package SpringJDBC4;

public class Teacher {

	private int tid;
	private String tname;
	private String taddress;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTaddress() {
		return taddress;
	}
	public void setTaddress(String taddress) {
		this.taddress = taddress;
	}
	public Teacher(int tid, String tname, String taddress) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.taddress = taddress;
	}
	public Teacher() {
		super();
	}
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", taddress=" + taddress + "]";
	}
	
}
