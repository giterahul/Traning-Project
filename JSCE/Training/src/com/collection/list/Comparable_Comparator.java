package com.collection.list;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparable_Comparator {
public static void main(String[] args) {
	
	List<String> listName=Arrays.asList("john","peter","tom","mary","ram","atul");
	List<Integer> listNumber=Arrays.asList(1,5,4,5,6,7,8);
	
	System.out.println("\nString sorting");
	System.out.println("before:"+listName);
	Collections.sort(listName);
	System.out.println("after:"+listName);
	
	System.out.println("\nInteger sorting");
	System.out.println("before:"+listNumber);
	Collections.sort(listNumber);
	System.out.println("after:"+listNumber);
	
	String sentence="sun mon tue wed thu fri sat";
	String [] words=sentence.split(" ");
	
	List<String> wordlist=Arrays.asList(words);
	System.out.println("day after sorting");
	Collections.sort(wordlist);
	
	
	/*List<Circle> circlelist=new ArrayList<Circle>();
	
	circlelist.add(new Circle(3.5));
	circlelist.add(new Circle(3.5));
	circlelist.add(new Circle(3.5)); 
	 */
	
	
	List<Student> studentlist=new ArrayList<Student>();
	studentlist.add(new Student(10,"ram",77.8f));
	studentlist.add(new Student(13,"ratul",76.8f));
	
}
}
