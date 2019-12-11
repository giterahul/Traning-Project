package com.basic;

class Calculator {
	
	public static void add(int a , int b)
	{
		int c = a+b;
		System.out.println("Addition = "+c);
	}
	
	public static void sub(int a , int b)
	{
		int c = a-b;
		System.out.println("Subtraction = "+c);
	}
	
	public static void mul(int a , int b)
	{
		int c = a*b;
		System.out.println("Multipication = "+c);
	}
	
	public static void div(int a , int b)
	{
		int c = a/b;
		System.out.println("Division = "+c);
	}
	
	public static void main(String args[]) {
		String opr = args[1];
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[2]);
		
		if(opr.equals("+"))
		{
			add(a,b);
		}
		else if(opr.equals("-"))
		{
			sub(a,b);
		}
		else if(opr.equals("m"))
		{
			mul(a,b);
		}
		else
		{
			div(a,b);
		}

	}
}