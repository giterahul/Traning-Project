package com.lang;

import java.io.Console;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class _System {
public static void main(String[] args) {
	int[]array1= {1,2,3,4,5};
	int[]array2= {10,20,30,40,50};
	System.arraycopy(array1,0,array2,2,2);
	System.out.println(array2);
	System.out.println(Arrays.toString(array2));
	
	Properties props=System.getProperties();
	
	System.getProperties().list(System.out);
	Set<Object> keySet=props.keySet();
	for(Object obj:keySet) {
		String key=(String) obj;
		System.out.println("{"+key+"="+props.getProperty(key)+"}");
		
	}
	System.out.println("\n\nSystem properties");
	System.out.println(System.getProperty("user.country"));
	
	//clear pr
	System.out.println("user.country");
	System.out.println(System.getProperty("user.country"));
	
   //set system
	System.setProperty("user.country","IN");
	System.out.println(System.getProperty("user.country"));
	
	Console console=System.console();
	
	char[] password;
	//password=console.readPassword("[%s]","password");
	//System.out.println(password);
	
	if(console !=null) {
		GregorianCalendar calender=new GregorianCalendar();
		console.printf("Wlecome %1$s%n","Nadeem");
		console.printf("current time is %1$tm %1$te,%1$tY%n",calender);
		console.flush();
	}else {
		System.out.println("No console attached");
	}
	//get current time
	long currentTimeMillis=System.currentTimeMillis();
	Date date=new Date(currentTimeMillis);
	System.out.println("current time in millis="+currentTimeMillis);
	System.out.println(date);
	
	Long nanoTime=System.nanoTime();
	System.out.println("current nano time="+nanoTime);
	
	//get unmodifiedable environment variavles
	Map<String,String> envMap=System.getenv();
	Set<String key: keySetEnv>{
		for()
	}
	
	/*Properties props=System.getProperties();
	props.list(System.out);*/
	
	//System.out.println();
}
}
