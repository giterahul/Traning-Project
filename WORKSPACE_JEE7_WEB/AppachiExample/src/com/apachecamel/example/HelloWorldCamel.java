package com.apachecamel.example;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class HelloWorldCamel {
	public static void main(String[] args) {
		
		CamelContext context=new DefaultCamelContext();
		
		//HelloWorldRouter router=new HelloWorldRouter();
		FileCopyRouter router=new FileCopyRouter(); 
		
		try
		{
			context.addRoutes(router);//adding router to context
			
			context.start();//starting the camel context
			
			context.stop();// stopping the camel context
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
