package Autowiring;

public class Address {

	private String city;
	private String State;
	
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", State=" + State + "]";
	}
	public Address() {
		super();
	}
	public Address(String city, String state) {
		super();
		this.city = city;
		State = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	
}
