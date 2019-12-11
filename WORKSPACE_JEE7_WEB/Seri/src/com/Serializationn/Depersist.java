package com.Serializationn;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Depersist {
	public static void main(String args[]){  
		  try{  
		 
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
		  Student s=(Student)in.readObject();  
		  Student ss=(Student)in.readObject();
		 
		  System.out.println(s.id+" "+s.name);  
		  System.out.println(ss.id+" "+ss.name);
		   
		  in.close();  
		  }catch(Exception e){System.out.println(e);}  
		 } 
}
