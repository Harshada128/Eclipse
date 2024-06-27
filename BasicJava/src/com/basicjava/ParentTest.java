package com.basicjava;

 class ParentTest implements parent1, parent2 {
	 public void fun() 
	    { 
	        System.out.println("fun function"); 
	    } 
	 
	 public static void main(String[] args) {
		 ParentTest t = new ParentTest();
		 t.fun();
	 }
	

}
