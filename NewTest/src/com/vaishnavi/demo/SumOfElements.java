package com.vaishnavi.demo;

public class SumOfElements {
	public static void main(String[] args) {
		int n=1234;
		int sum=0,rem;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("Sum is "+sum);
	}

}
