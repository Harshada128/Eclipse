package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(4);
		l.add(null);
		l.add(null);
		
		//System.out.println(l);
		Iterator itr = l.iterator(); 
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ListIterator li = l.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
	
	}

}
