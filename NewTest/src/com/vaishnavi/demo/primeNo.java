package com.vaishnavi.demo;

import java.util.Scanner;

public class primeNo {

	public static void main(String[] args) {
		System.out.println("Enter a number2");
		Scanner obj=new Scanner(System.in);
		int no=obj.nextInt();
		int count=0;
		int temp;
		temp=no;
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				count++;
			}
		}
		if(count==2) {
			System.out.println("Prime no");
		}
		else
		{
			System.out.println("Not Prime no");
		}
	}

}
