package com.basic;
import java.util.*;

public class Calendor {
	
	public static void jan(int m , int y)
	{
		System.out.println("January "+y+" Has 31 Days");
	}
	public static void feb(int m , int y)
	{
		if(y % 4 == 0 && (y % 100 != 0 || y % 400 == 0))
		{
			System.out.println("Feb "+y+" Has 28 Days");
		}
		else
		{
			System.out.println("Feb "+y+" Has 29 Days");
		}
	}
	
	public static void mar(int m , int y)
	{
		System.out.println("March "+y+" Has 31 Days");
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month,year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Month and Year");
		month=sc.nextInt();
		year=sc.nextInt();
		
		switch(month)
		{
			case 1 : jan(month , year);
					break;
			case 2 : feb(month , year);
					break;
			case 3 :mar(month , year);
					break;
			case 4 :apr(month , year);
					break;
			case 5 :mar(month , year);
					break;
		}

	}

}
