package com.basicjava;

 class Animal2 {
	 
	 String color;
	 int age;
	 
	  void initObj(String c, int a) 
	  {
		 color = c;
		 age = a;
	 }
	  
	  void display()
	  {
		  System.out.println(color + " " +age);
	  }

	public static void main(String[] args) {
		
		Animal2 buzo = new Animal2();
		buzo.initObj("black", 23);
		buzo.display();
	}

}
