package com.ronaldbarros.section06.conditional_operators;

import java.util.Scanner;

public class Exercise08 {
	
	public static void main(String[] args) {
		
		int number;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		number = input.nextInt();
		
		if (number > 0) {
			System.out.println(number + " is positive");
		}else if (number == 0) {
			System.out.println("Zero is a neutral number");
		}else {
			System.out.println(number + " is negative");
		}
		if (number % 2 == 0) { 
			System.out.println(number + " is even");
		}else {
			System.out.println(number + " is odd");
		}
		
	}

}
