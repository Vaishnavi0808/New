package com.vaishnavi.demo;

import java.util.Scanner;

public class Occurence {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String input = sc.nextLine();
		
		int count=0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a') {
			count++;
}
		}	
		System.out.println("Occurence of character a is " + count);  
		
			
		
	}	
		
		
		
	}


	