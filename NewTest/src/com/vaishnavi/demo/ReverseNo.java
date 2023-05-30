package com.vaishnavi.demo;

public class ReverseNo {

	public static void main(String[] args) {
		int no=1223;
		int r,rev=0;
		while(no>0)
		{
			r=no%10;
			rev=(rev*10)+r;
			no=no/10;
		}
		System.out.println("Reverse no is "+rev);

	}

}
