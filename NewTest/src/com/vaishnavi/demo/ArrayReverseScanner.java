package com.vaishnavi.demo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverseScanner {

	public static void main(String[] args) {
		System.out.println("Enter array size");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int arr[]=new int[input];
		System.out.println("Enter array elements");
		for(int i=0;i<input;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Reverse elements are");
		for(int i=input-1;i>=0;i--)
		{
			System.out.println(arr[i]+" ");
		}
//		Arrays.sort(arr);
//		for(int num:arr)
//		{
//			System.out.println(num);
//		}

	}

}
