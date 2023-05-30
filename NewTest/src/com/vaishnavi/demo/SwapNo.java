package com.vaishnavi.demo;

import java.util.Scanner;

public class SwapNo {
	
	public static void main(String[] args) {
		System.out.println("Enter a ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter b ");
		int b=sc.nextInt();
//		int a=10;
//		int b=20;
		System.out.println("After swapping ");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}
	
}
