package com.apachecamel.example;

import org.apache.camel.builder.RouteBuilder;

public class FileCopyRouter extends RouteBuilder
{
	
	
	public void configure()throws Exception
	{
		from("file:C:\\Users\\Allianz3081\\Simple\\JavaSimple.java?noop=true").to("file:C:\\Users\\Allianz3081\\program");
		
		System.out.println("file is moved");
		
	}
	
}