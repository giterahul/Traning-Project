package com.basic;
interface abc
{
	void sum();
	
	void show();
	void display();
	
}
public abstract class InterfaceExample implements abc
{
	public void sum()
	{
		System.out.println("add the data");
	}
	/*public void show()
	{
		System.out.println("show the data");
		
	} */
	public abstract void show();
	

}
