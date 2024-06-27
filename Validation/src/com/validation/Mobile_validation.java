package com.validation;

import java.util.Scanner;

public class Mobile_validation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter your Mobile_no: ");
	     String phone = sc.next();
	     String regex = "^\\+\\d{10,30}$";
	     //"^(\\+\\d{1,3})?\\d{10,30}$"
	     //Matching the given phone number with regular expression
	     boolean result = phone.matches(regex);
	     if(result) {
	        System.out.println("Given Mobile_no is valid");
	     } else {
	        System.out.println("Given Mobile_no is not valid");
	     }
	     
		}

}

