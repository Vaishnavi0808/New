package com.collections;

import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		HashSet<Product> obj=new HashSet<>();
		Product p1=new Product(1,"abc",5,7);
		Product p2=new Product(1,"abc",5,7);
		
		obj.add(p1);
		obj.add(p2);
		
		System.out.println(obj);
		
	}
	
	
	

}
