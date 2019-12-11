package com.enums;

public enum Days {
	Mon,
	Tue,
	Wen,
	Thu,
	Fri,
	Sat,
	Sun, today;
	public static void main(String[] args) {
	
		Days day=Days.Mon;
		if(day==Days.Mon)
		{
			System.out.println("It is Monday");
		}
		for(Days d:Days.values())
		{
			System.out.println(d);
		}
		switch(today)
		{
		case Mon:
			System.out.println("mon..");
			break;
		case Tue:
			System.out.println("tue..");
			break;
		case Wen:
			System.out.println("wen..");
			break;
		case Thu:
			System.out.println("Thu..");
			break;
		case Sat:
			System.out.println("sat..");
			break;
		case Sun:
			System.out.println("sun..");
			break;
		}
	}

}
