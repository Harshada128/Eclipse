package com.collections;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		
		 ArrayList al = new ArrayList();
		 al.add(100);
		 al.add(200);
		 al.add(300);
		 al.add("aaa");
		 
		System.out.println(al);
		
		 ArrayList al1 = new ArrayList();
		 al1.add("aaa");
		 al1.add("bbb");
		 al1.add("ccc");
		 al1.add("All");
		 
		System.out.println(al1);
		
		//al.addAll(al1);
		
		System.out.println(al.add("All"));
		
		System.out.println(al);
		
		System.out.println(al.contains(500));

		System.out.println(al.isEmpty());
		
		System.out.println(al.size());
		
		System.out.println(al.remove(1));
		//System.out.println(al.remove("bbb"));
		//al.removeAll(al1);
		System.out.println(al.removeAll(al1));
		
		System.out.println(al);
		
		System.out.println(al1);

		al.clear();
		//al1.clear();
		
	   System.out.println(al);
		//System.out.println(al1);
	}

}
