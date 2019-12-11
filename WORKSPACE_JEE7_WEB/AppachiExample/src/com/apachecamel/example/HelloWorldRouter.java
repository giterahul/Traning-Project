package com.apachecamel.example;

import org.apache.camel.builder.RouteBuilder;

public class HelloWorldRouter extends RouteBuilder
 {
	public void configure()throws Exception{
		System.out.println("hello World..");
	}

}
