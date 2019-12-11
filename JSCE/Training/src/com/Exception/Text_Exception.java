package com.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Text_Exception {
	public static int divide(int no1,int no2)throws Exception
	{
		int result=0;
		if(no2<=0)
			throw new Exception("can not divide by zero");
		return no1/no2;
	}
	class DivideByZeroException extends Exception
	{
		public DivideByZeroException(String title)
		{
			super(title);
		}
		public String getMessage()
		{
			return "DivideByZeroException->"+super.getMessage();
		}
	}
public static void main(String[] args) throws Exception {
	/*if(args.length!=2)
	{
		System.out.println("please provice runtime arguments..");(
		return;
	} */
	try
	{
		System.setErr(new PrintStream(new File("err.log")));
		System.setOut(new PrintStream(new File("out.log")));
		
	}catch(FileNotFoundException e)
	{
		System.out.println(e);
	}
	int no1,no2,result;
	no1=no2=result=0;
	no1=10; no2=0;
	System.out.println("starting..");
	try {
		result=divide(no1,no2);
		System.out.println("result"+result);
	}catch(DivideByZeroException ex)
	{
		System.out.println(ex);
	}
	try {
	
	
	no1=Integer.parseInt(args[0]);
	System.out.println("1st argument proceed...");
	
	no2=Integer.parseInt(args[1]);
	System.out.println("2st argument proceed...");
	
	result=no1/no2;
	System.out.println("Arithmetic operation performed..");
	
	System.out.println("Result:"+result);
	System.out.println("Ending..");
	}catch(ArrayIndexOutOfBoundsException ex)
	{
		System.out.println(ex);
	}
	catch(NumberFormatException ex)
	{
		System.out.println(ex);
	}
	catch(ArithmeticException ex)
	{
		System.out.println(ex);
	}
	catch(Exception ex)
	{
		System.out.println(ex);
	}
	

}
}
