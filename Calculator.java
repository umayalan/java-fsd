package com.simplilearn.calculator;
import java.util.Scanner;

public class Calculator {
	

	
	
	public static void main(String args[])
	{
		int Output;
		Scanner nm=new Scanner(System.in);
		System.out.println("Enter First Number");
		int  Firstnumber=nm.nextInt();
		System.out.println("Enter Second Number");
		int  Secondnumber=nm.nextInt();
		System.out.println("Enter the operation to be performed");
		char operator=nm.next().charAt(0);
		
		switch(operator)
		{
		case '+':
		{
		Output=Firstnumber+Secondnumber;
		System.out.println(Firstnumber+ "+"+Secondnumber+ "=" +Output);
		break;
		}
		
		case '-':
		{
		Output=Firstnumber-Secondnumber;
		System.out.println(Firstnumber+ "-"+Secondnumber+ "=" +Output);
		break;
		}
		
		case '*':
		{
		Output=Firstnumber*Secondnumber;
		System.out.println(Firstnumber+ "*"+Secondnumber+ "=" +Output);
		break;
		}
		
		case '/':
		{
		Output=Firstnumber/Secondnumber;
		System.out.println(Firstnumber+ "/"+Secondnumber+ "=" +Output);
		break;
		}
			
		}
		
		}
		
			
		
	}

