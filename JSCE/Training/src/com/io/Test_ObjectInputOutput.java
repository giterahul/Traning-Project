package com.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import com.arrays.Student;

public class Test_ObjectInputOutput {

	public static void main(String[] args) {
	Student s1=new Student(101,"amar");
	Student s2=new Student(102,"ram");
	Student s3=new Student(103,"atul");
	List<Student> liststudent=Arrays.asList(s1,s2,s3);
	
	File file=new File("C:\\New folder\\abc.txt");
	try
	
		(FileOutputStream fileOutput=new FileOutputStream(file);
			ObjectOutputStream objectoutput=new ObjectOutputStream(fileOutput))
		{
		objectOutput.writeObject(listStudent);
		
		
	}
			
			
			
	
	

	}

}
