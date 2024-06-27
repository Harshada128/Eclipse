package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set s = new HashSet();
		
		s.add(100);
		s.add(200);
		s.add(300);
		s.add(400);// can not store repeated value
		s.add(400);
		s.add(null); //only one time store null value
		s.add(null);
		
		//System.out.println(s);
		
		Iterator itr = s.iterator(); //only used Iterator method to get element
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
