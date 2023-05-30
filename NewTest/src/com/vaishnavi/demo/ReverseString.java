package com.vaishnavi.demo;

public class ReverseString {

	public static void main(String[] args) {
		String str="Vaishnavi",str1=" ";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			str1=ch+str1;
		}
		System.out.println(str1);
		
		

	}

}
