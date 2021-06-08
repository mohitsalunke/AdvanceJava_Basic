package SpingLifeCycle;

public class Branch {

	private int branchid;
	private String address;
	
	
	
	@Override
	public String toString() {
		return "Branch [branchid=" + branchid + ", address=" + address + "]";
	}
	public Branch() {
		super();
	}
	public Branch(int branchid, String address) {
		super();
		this.branchid = branchid;
		this.address = address;
	}
	public int getBranchid() {
		return branchid;
	}
	public void setBranchid(int branchid) {
		this.branchid = branchid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
