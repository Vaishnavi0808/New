package com.vaishnavi.demo;

public class Fabonacci {
	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		int n=10;
		//System.out.println("Enter the number");
		int n3;
		System.out.println(n1+" "+n2);
		
		for(int i=2;i<=n;i++)
		{
			n3=n1+n2;
			System.out.println(""+n3);
			n1=n2;
			n2=n3;
		}
	}

}
