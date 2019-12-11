package com.collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class MyCollection {
	public static void main(String[] args) {
		//ArrayList list=new ArrayList(5);
		 Vector list =new Vector();
		 //
		
		System.out.println(list.size()+"\t"+list);
		
		list.add("sun");
		list.add("tue");
		list.add("Wed");
		System.out.println(list.size()+"\t"+list);
		
		list.add(1,"mon");
		System.out.println(list.size()+"\t"+list);
		
		list.add("thus");
		list.add("free");
		list.add("sat");
		list.add("soon");
		
		System.out.println(list.size()+"\t"+list);
		
		list.set(5,"fri");
		System.out.println(list.size()+"\t"+list);
		if(list.contains("soon"))
		{
			list.remove("soon");
		}
		System.out.println(list.size()+"\t"+list);
		
		list.add("moon");
		System.out.println(list.size()+"\t"+list);
		
		Iterator itr=list.iterator();
		list.forEach(System.out::println);
		
		list.forEach((day) -> System.out.println(day));
		while(itr.hasNext())
		{
			String day=(String) itr.next();
			if(day.equals("moon"))
				itr.remove();
		}
		ListIterator lstitr=list.listIterator();
		while(lstitr.hasNext()) {
			String day=(String) lstitr.next();
			if(day.equals("moon"))
				itr.remove();
			
		}
		System.out.println(list.size()+"\t"+list);
		
		Collections.sort(list);
		System.out.println(list.size()+"\t"+list);
		
		Collections.shuffle(list);
		System.out.println(list.size()+"\t"+list);
	
	}

}
