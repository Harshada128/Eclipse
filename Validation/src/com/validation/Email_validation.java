package com.validation;

import java.util.Scanner;

public class Email_validation {
	
	public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter your Email: ");
     String phone = sc.next();
     String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
   
     //\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b"
     //Matching the given Email number with regular expression
     boolean result = phone.matches(regex);
     if(result) {
        System.out.println("Given email-id is valid");
     } else {
        System.out.println("Given email-id is not valid");
     }
     
	}

}
