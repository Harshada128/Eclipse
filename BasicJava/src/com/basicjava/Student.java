package com.basicjava;

public class Student {
	static int last_roll = 100;
	int roll_no ;
	
	Student()
	{
		roll_no = last_roll;
		last_roll++;
		
	}
	
	public int hashCode() {
		return roll_no;
	}

	public static void main(String[] args) {
		
		Student sd = new Student();
		System.out.println(sd);
		System.out.println(sd.toString());

	}

}
