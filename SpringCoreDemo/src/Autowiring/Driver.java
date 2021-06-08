package Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Driver {

	@Value("101")
	private String did;
	@Value("Dnayaneshwar")
	private String DriverName;
	@Autowired
	Vehicle vehicle;
	
	
	@Override
	public String toString() {
		return "Driver [did=" + did + ", DriverName=" + DriverName + ", vehicle=" + vehicle + "]";
	}
	
	public Driver() {
		
	}
	//@Autowired
  /* public Driver(String did, String driverName, Vehicle vehicle) {
		
		this.did = did;
		DriverName = driverName;
		this.vehicle = vehicle;
	}*/
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getDriverName() {
		return DriverName;
	}
	public void setDriverName(String driverName) {
		DriverName = driverName;
	}
	/*public Vehicle getVehicle() {
		return vehicle;
	}
	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}*/
}
