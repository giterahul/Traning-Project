package com.arrays;
import java.util.Arrays;
import com.classes.Student;
import java.util.Scanner;

import com.classes.*;
import java.util.*;
public class Test_Student_Array {
	Scanner sc=new Scanner(System.in);
	Student[] studs=new Student[7];
	Student student=new Student();
	public void addElment()
	{
		System.out.println("add method called");
		System.out.println("Enter the rollno,name,marks");
		for(int i=0;i<studs.length;i++)
		{
			if(studs[i]==null)
			{
				studs[i]=new Student(sc.nextInt(),sc.next(),sc.nextFloat());
			}
			System.out.println(Arrays.toString(studs));
			
		}
	}
	public static void main(String args[])
	{
		int option;
		
		
	}
	

}	