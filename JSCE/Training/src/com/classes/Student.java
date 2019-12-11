package com.classes;

public class Student {
	private int rollno;
	private String name;
	private float marks;
	
	public Student()
	{
		/*rollno=0;
		name=null;
		marks=0.0f;
		System.out.println("student->def..");  */
		setRollno(0);
		setName(null);
		setMarks(0.0f);
		System.out.println();System.out.println("student->def..");
		
	}


	public Student(int rollno, String name, float marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		System.out.println("student->param...");
	}
	
	
	public int getRollno() {
		return rollno;
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getName() {
		return name;
	}


	public float getMarks() {
		return marks;
	}


	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s);
		Student s1=new Student(1,"rahul",7.7f);
		s.setMarks(22.7f);
		s.setName("sheetal");
		System.out.println(s1);
		System.out.println(s);
		
	

	}


	private void setName(String string) {
		// TODO Auto-generated method stub
		
	}


	private void setMarks(float f) {
		// TODO Auto-generated method stub
		
	}


}
