package com.arrays;
import java.util.Arrays;
import com.classes.*;

public class Student {
	int Rollno;
	String name;
	float marks;
	public Student(int rollno, String name, float marks) {
		super();
		setRollno(rollno);
		setName(name);
		setMarks(marks);
		 
	}
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [Rollno=" + Rollno + ", name=" + name + ", marks=" + marks + "]";
	}
}
