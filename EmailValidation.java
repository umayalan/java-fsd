package com.simplilearn.practiseproject;

import java.util.Scanner;


public class EmailValidation {
	
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			//Storing list of emailid in an array
			 String Array[]= {"jai@gmail.com",
					          "uma12@gmail.com",
					          "varsh32@gmail.com",
					           "sano@gmail.com",
					           "maha@gmail.com",
					           "vijay@gmail.com",
					           "janani@96@gmail.como",
					           "kavs@gmail.com",
					           "amar@gmail.com",
					           "sandy@gmail.com",
					           "chan@gmail.com"};
					
			 System.out.println("Enter the EmailId to search");
			//Get input from user to search emailid
		   String s=sc.next();
		   //Validating email
		      
		      for(int  i=0;i<Array.length;i++)
		       {
		    	  
		       if(Array[i].equals(s))
		       {
		       
		    	   System.out.println("EmailId validated");
		       
		       }
		      else {
		    	  System.out.println("Invalid email");
		      }
		       }
		    
		       
		       
		       
		       
		
			 
			        
			        

		       
		       }

		
}