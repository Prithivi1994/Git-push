package com.organisation;

import java.util.ArrayList;
import java.util.List;

public class A{
	public static void main(String[] args){
		List<Integer> l=new ArrayList<Integer>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		
		Object[] array = l.toArray();
		for (Object object : array) {
			System.out.println(object);	
		}
	
		
		
		
		
		
	}
	
}
