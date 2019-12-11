package com.arrays;

import java.util.*;

public class RandomArray {
	public static int min(int nums[])
	{
		int min=nums[0];
		for(int i=1;i<nums.length;i++)
		{
			if(min>nums[i])
			{
				min=nums[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Length Of array : ");
		int size = sc.nextInt();
		int[] nums = new int[size];
		for(int i=0 ; i<nums.length;i++)
		{
			System.out.println("Enter The No. : ");
			nums[i]=sc.nextInt();
		}
		
		System.out.println("Min = "+min(nums));
		//Odd And Even Number
		for(int i=0 ; i<nums.length ; i++)
		{
			if(nums[i]%2==0)
			{
				System.out.println(nums[i] + " is Even no.");
			}
			else
			{
				System.out.println(nums[i] + " is Odd no.");
			}
		}
		
		//Minimum Number
		
		//System.out.println("Minimum = "+min);
		
		//Shuffle The Array
		System.out.println(Arrays.toString(nums));

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 100);
		}
		System.out.println(Arrays.toString(nums));

	}

}
