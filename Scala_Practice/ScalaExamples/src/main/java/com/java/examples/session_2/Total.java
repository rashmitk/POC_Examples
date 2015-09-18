package com.java.examples.session_2;

import java.util.ArrayList;
import java.util.List;

public class Total {
	
	static int total(List<Integer> intList){
		
		int sum = 0;
		
		for(int num : intList){
			sum += num;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		
		System.out.println(total(l));
	}

}
