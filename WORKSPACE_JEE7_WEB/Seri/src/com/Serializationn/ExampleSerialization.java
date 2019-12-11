package com.Serializationn;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ExampleSerialization 
{
	public static void main(String args[]){  
		  try{  
	
		  Student s1 =new Student(101,"rahul");  
		  Student s2=new Student(102, "atul");
		    
		  FileOutputStream fout=new FileOutputStream("f.txt");  
		  ObjectOutputStream out=new ObjectOutputStream(fout);  
		  out.writeObject(s1);  
		  out.writeObject(s2);
		  out.flush();  
		   
		  out.close();  
		  System.out.println("success");  
		  }catch(Exception e)
		  {System.out.println(e);}  
		 }  

}
