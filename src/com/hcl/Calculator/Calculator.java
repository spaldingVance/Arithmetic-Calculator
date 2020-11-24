package com.hcl.Calculator;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Calculator!");
		System.out.println("Operations Supported: +, -, *, /");
		
		
		Scanner input = new Scanner(System.in);
		
		//Input comes in form of "{num} {operation} {num}"
		// ex. "3 * 5"
		
		
		char exitChoice = 'Y';
		
		do {
			System.out.println("Please enter a 2 number equation delineated by single spaces");
			System.out.print("\n");
			float result = 0.0f;
			float firstNum = input.nextFloat();
			char operation = input.next().charAt(0);
			float secondNum = input.nextFloat();
			
			if (operation == '+') {
				result = firstNum + secondNum;
				
			} else if (operation == '-') {
				result = firstNum - secondNum;
				
			} else if (operation == '*' ) {
				result = firstNum * secondNum;
				
			} else if (operation == '/') {
				result = firstNum / secondNum;
				
			} else {
				System.out.println("Invalid entry, please try again");
				continue;
			}
			
			System.out.println("Result: ");
			System.out.println(result);
			
			
			System.out.println("Would you like to enter another equation? (Y/N)");
			
			exitChoice = input.next().charAt(0);

			
		} while (exitChoice == 'Y' || exitChoice == 'y');
		
		System.out.println("Goodbye!");
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
