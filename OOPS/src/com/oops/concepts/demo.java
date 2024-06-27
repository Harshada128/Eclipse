package com.oops.concepts;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c = " Hello i am practicing Java";
		c = c.trim();
		c = c.replaceAll("am", "was");
		c = c.substring(3,5);
		byte[] b = c.getBytes();
		for (int i = 0; i<b.length; i++) {
			System.out.println(b[i]);

		}
		System .out.println(c);
		}

}
