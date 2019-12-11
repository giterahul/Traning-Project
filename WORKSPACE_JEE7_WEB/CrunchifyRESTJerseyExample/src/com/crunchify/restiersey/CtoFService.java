package com.crunchify.restiersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/ctofservice")
public class CtoFService {
	@GET
	@Produces("application/xml")
	public String convertCtoF() {
		Double fahrenherit;
		Double celsius=36.8;
		fahrenherit=((celsius*9)/5)+32;
		
		String result="@Produces(\"application/xml\") Output: \n\nC to F Converter Output:\n\n" +fahrenherit;
		return "<ctofservice>"+"<celsius>"+celsius+"</celsius>"+"<ctofoutput>"+result+"</ctofoutput>"+"</ctofservice>";
		
	}
	@Path("{c}")
	@GET
	@Produces("application/xml")
	public String convertCtofromInput(@PathParam("c")Double c) {
		Double fahrenheit;
		Double celsius=c;
		fahrenheit=((celsius*9)/5)+32;
		
		String result="@Produces(\"application/xml\") Output: \n\nC to F Converter Output:\n\n" +fahrenheit;
		return "<ctofservice>"+"<celsius>"+celsius+"</celsius>"+"<ctofoutput>"+result+"</ctofoutput>"+"</ctofservice>";
		
	}
	

}
