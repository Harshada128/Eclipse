package com.collections;
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(1, "Abhi");
		hm.put(2, "Arun");
		hm.put(3, "Siya");
		hm.put(4, "sahil");
		hm.put(5, null);
		//hm.put(1, "sss");
		
		//hm.remove(1);
		System.out.println(hm);
		System.out.println(hm.containsKey(1));
		System.out.println(hm.containsValue("Anu"));
		System.out.println(hm.isEmpty());
		System.out.println(hm.size());
		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
	
	}

}
