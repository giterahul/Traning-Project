
package com.apachecamel.example;

import org.apache.camel.CamelContext;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class FileProcessorCamel 
{
	public static void main(String[] args) {
		
	
	CamelContext context=new DefaultCamelContext();
	try {
		context.addRoutes(new RouteBuilder() {

			@Override
			public void configure() throws Exception {
				from("file:input_dir?noop=true").process(new FileProcessor()).to("file:output_dir");
			}
			
			
		});
		while(true)
		{
		context.start(); 
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
