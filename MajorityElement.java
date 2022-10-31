package javaChallenge6;

import java.util.Scanner;

//Java Problem (6/20)
//
//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//
//Example 1:
//
//Input: nums = [3,2,3]
//Output: 3
//Example 2:
//
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2
public class MajorityElement {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = scan.nextInt();
	
		int[] nums = new int[size];
		
		int count =0,temp=0,count_=0;
		
		System.out.println("Enter array Element(Integer)");
		System.out.println("===============================");
		for (int i=0;i<size;i++)
		{
			nums[i]=scan.nextInt();
		}
		scan.close();
		for(int i=0 ;i<size;i++)
		{
			count=0;
			for(int j=0;j<size;j++)
			{
				if(nums[i]==nums[j])
				{
					count++;
				}
			}
			
			if(count>size/2)
			{
				temp=nums[i];
				count_=count;
			}
			
			
		}
		if(count_>size/2)
		{
		System.out.println("majority element is ====> "+temp);
		}
		else
		{
			System.out.println("No majority element");
		}
		
		
	}

}
