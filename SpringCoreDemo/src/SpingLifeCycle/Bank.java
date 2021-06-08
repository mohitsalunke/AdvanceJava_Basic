package SpingLifeCycle;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//public class Bank implements InitializingBean,DisposableBean {
	public class Bank{
	private int bid;
	private String bname;
	Branch branch;
	Customer customer;
	
	
	@Override
	public String toString() {
		return "Bank [bid=" + bid + ", bname=" + bname + ", branch=" + branch + ", customer=" + customer + "]";
	}
	public Bank() {
		super();
	}
	public Bank(int bid, String bname, Branch branch, Customer customer) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.branch = branch;
		this.customer = customer;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	/*@Override
	public void destroy() throws Exception {
		System.out.println("In Distroy method");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("In Init methods");
		
	}*/
	
	
	@PostConstruct
	public void myinit()
	{
		System.out.println("Init method");
	}
	
	
	//@PostDestroy
	public void mydestroy()
	{
		System.out.println("In Destroy method");
	}
	
			
}
