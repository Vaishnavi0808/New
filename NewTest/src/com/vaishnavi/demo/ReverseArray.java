package com.vaishnavi.demo;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[]= {3,5,7,9,2};
//		for(int i=arr.length-1;i>=0;i--)
//		{
//			System.out.println(arr[i]+" ");
//		}
		Arrays.sort(arr);
		for(int no:arr)
		{
			System.out.println(no);
		}

	}

}
