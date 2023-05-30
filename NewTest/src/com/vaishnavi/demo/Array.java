package com.vaishnavi.demo;

public class Array {
	public static void main(String[] args) {
		int arr[]= {3,6,9,4,12};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
