package com.basicjava;

//This program is object initialization using constructor

 class Animal {
	
	// data members of the class.
	String color;
	int age;
	
	// Parameterized Constructor
	Animal(String color, int age){
		this.color = color;
		this.age = age;
	}
	 
	// Copy Constructor
	Animal(Animal obj){
		this.color = obj.color;
		this.age = obj.age;
	}

	public static void main(String[] args) {
		
		 // This would invoke the parameterized constructor.
		Animal buzo = new Animal("Black", 20);
		System.out.println("Color:" + buzo.color +"     Age:" +buzo.age);
		
		System.out.println();
		
		// This would invoke the copy constructor.
		Animal buzo2 = new Animal(buzo);
		System.out.println("Color:" + buzo2.color +"     Age:" +buzo2.age);
	}

}
