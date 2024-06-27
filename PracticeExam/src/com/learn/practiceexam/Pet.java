package com.learn.practiceexam;

import java.util.ArrayList;
import java.util.List;

public class Pet {
	
		      private String name;
		      private String breed = "German Shepherd";
		      private static final List<Pet> petList = new ArrayList<>();
		      public Pet(String name, String breed){
		          this.name = name;
		          this.breed = breed;
		          petList.add(this);
		      }
		      public static void printPets(){
		          for(var pet : petList){
		              System.out.println(pet.name + " is of breed " + pet.breed);
		          }
		      }
		      
		      public static void main (String listArg[])
		      {
		    	  Pet obj1 = new Pet("Jerry", "Indian");
		    	  Pet obj2 = new Pet("Tommy", "Traditional");
		    	  Pet.printPets();
		      }
		

}
