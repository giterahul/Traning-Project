package com.lang;
import java.util.Map;
//import java.util.map;
public class ReasAllEnvVariables {
public static void main(String[] args) {
	if(args.length>0) {
		String value=System.getenv("JAVA_HOME");
		if(value !=null) {
			System.out.println(args[0].toUpperCase()+"=="+value);
			
		}else {
			System.out.println("no such envm variable exists");
		}
	}else
	{
		Map<String,String> vars=System.getenv();
		for(String var:vars.keySet()) {
			System.out.println(var+"="+vars.get(var));
		}
		
	}
}
}
