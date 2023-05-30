package com.vaishnavi.demo;

public class CountDigits {
	public static void main(String[] args) {
		int no=8949598;
		int count=0;
		while(no>0)
		{
			no=no/10;
			count++;
		}
		System.out.println(count);
	}

}
