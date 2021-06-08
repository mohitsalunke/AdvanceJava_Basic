package com.SpringJDBC3;

public class Circle2 {

	
	private int id;
	private String name;
	
	public Circle2() {
		super();
	}
	
	public Circle2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Circle [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}
