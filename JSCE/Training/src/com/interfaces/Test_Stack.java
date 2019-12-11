package com.interfaces;
import java.util.*;

public class Test_Stack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack_imple x = new Stack_imple();
		System.out.println("Enter The Size : ");
		int no=sc.nextInt();
		for(int i=0;i<no;i++)
		{
			System.out.println("enter The no : ");
			int num = sc.nextInt();
			x.push(num);
		}
		int[] arr = x.disp();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Pop Element = "+x.pop());
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}

interface IStack {
	void push(int num);
	int pop();
}

class Stack_imple implements IStack {
	int[] stck = new int[5];
	int top = -1;
	
	
	@Override
	public void push(int num) {
		if(top>=stck.length)
		{
			System.out.println("Stack Overflow");
		}
		else
		{
			top++;
			stck[top]=num;
		}
	}
	
	int[] disp()
	{
		return stck;
	}

	@Override
	public int pop() {

		if(top < 0)
		{
			System.out.println("Stack Is Empty");
			return 0;
		}
		else
		{
			int ret;
			ret=stck[top--];
			return ret;
		}
	}
}
