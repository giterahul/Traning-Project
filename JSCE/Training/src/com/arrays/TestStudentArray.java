package com.arrays;
import java.util.Arrays;
import com.classes.Student;
import java.util.Scanner;


public class TestStudentArray {
	Scanner sc=new Scanner(System.in);
	Student[] stud=new Student[5];
	Student student=new Student();
	
	public void addElement()
	{
		System.out.println("enter rollno,Name,Marks");
		for(int i=0;i<stud.length;i++) {
			if(stud[i]==null) {
				stud[i]=new Student(sc.nextInt(),sc.next(),sc.nextFloat());
				System.out.println("element add");
				break;
			}
		}
	}
	public void findbyRollno(int rollNo)
	{
		for(int i=0;i<stud.length;i++) {
			if(stud[i].getRollno()==rollNo) {
				System.out.println(stud[i]);
				break;
				
			}
		}
	}
	public void deletebyRollNo(int rollNo) {
		for(int i=0;i<stud.length;i++) {
			if(stud[i].getRollno()==rollNo) {
				for(int j=0;j<stud.length -1;j++) {
					stud[i]=stud[i+1];
				}
				break;
				
			}
		}
	}
	public void listAll()
	{
		System.out.println(Arrays.toString(stud));
	}
	public void exit()
	{
		
	}
	public static void main(String[] args) {
		int option;
		Scanner sc=new Scanner(System.in);
		TestStudentArray obj=new TestStudentArray();
		do {
			System.out.println(
					"Enter choice\n 1.add \n 2.delete by rollno \n 3.find by rollno \n 4.list all\n 5.exit all");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				obj.addElement();
				break;
			case 2:
				System.out.println("enter rollno");
				int rno=sc.nextInt();
				obj.deletebyRollNo(rno);
				break;
			case 3:
				System.out.println("enter rollno");
				int rno1=sc.nextInt();
				obj.findbyRollno(rno1);
				break;
			case 4:
				obj.listAll();
				break;
			case 5:
				break;
			}
			System.out.println("you want to continue press0");
			option=sc.nextInt();
		}while(option==0);
		
	}

}