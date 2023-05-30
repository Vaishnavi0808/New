package com.vaishnavi.demo;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner obj=new Scanner(System.in);
		int input=obj.nextInt();
		int rem,sum=0,temp;
		temp=input;
		while(input>0)
		{
			rem=input%10;
			sum=(sum*10)+rem;
			input=input/10;
		}
		if(temp==sum) {
		System.out.println("Palindrome no");
		}
		else {
			System.out.println("Not a palindrome number");
		}
		
		
		

	}

}
