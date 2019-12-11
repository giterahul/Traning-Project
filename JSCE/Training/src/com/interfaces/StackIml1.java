package com.interfaces;

import java.util.Scanner;
interface IStack
{
	void push(int item);
	int pop();
}

class StackImp implements IStack {
	protected int[] statckArray;
	protected int tos;
	
	public StackImp(int capacity)
	{
		statckArray = new int[capacity];
		tos= -1;
	}
	
	@Override
	public void push(int item) {
		// TODO Auto-generated method stub
		if(tos==(statckArray.length -1)) {
			System.out.println("stack is full");
			return;
			
		}else
		{
			tos++;
			statckArray[tos]=item;
		}
		
	}

	@Override
	public int pop() {
		if(tos == -1)
		{
			System.out.println("stack is empty");
			throw new ArrayIndexOutOfBoundsException();
			
		}else
		{
			int value=statckArray[tos];
			tos--;
			return value;
		}
		
		
	}
}
public class StackIml1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the capacity of stack");
		int capacity=sc.nextInt();
		IStack obj=new StackImp(capacity);
		int ch;
		int ans;
		do
		{
			System.out.println("statck operation\n1.push\n 2.pop\nEnter choice");
			ch=sc.nextInt();
			if(ch==1)
			{
				System.out.println("Enter element");
				int element=sc.nextInt();
				obj.push(element);
			}
			else if(ch==2)
			{
				int value=obj.pop();
				if(value!=0)
				{
					System.out.println(value);
				}
			}
			else
			{
				System.out.println("wrong choice");
			}
			System.out.println("do u want to continue0\1");
			ans=sc.nextInt();
		}while(ans==1);
	}

}
