package com.model;

public class Student {
	private String name;
	private int rollno;
	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	public Student() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	

}
