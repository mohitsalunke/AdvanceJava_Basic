package Basics;

public class Triangle {

	private point pointA;
	private point pointB;
	private point pointC;
	
	
	public Triangle() {
		super();
	}
	public Triangle(point pointA, point pointB, point pointC) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}
	public point getPointA() {
		return pointA;
	}
	public void setPointA(point pointA) {
		this.pointA = pointA;
	}
	public point getPointB() {
		return pointB;
	}
	public void setPointB(point pointB) {
		this.pointB = pointB;
	}
	public point getPointC() {
		return pointC;
	}
	public void setPointC(point pointC) {
		this.pointC = pointC;
	}
	@Override
	public String toString() {
		return "Triangle [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + "]";
	}
	
	
	
}
