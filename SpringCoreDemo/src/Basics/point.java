package Basics;

public class point {

	String x;
	String y;
	
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "point [x=" + x + ", y=" + y + "]";
	}
	
}
