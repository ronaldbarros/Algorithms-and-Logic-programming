package com.ronaldbarros.section02;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		//variables
		int num1, num2, sum, product;
		Scanner keyboard = new Scanner(System.in);
		
		//Input
		System.out.println("Enter the first number: ");
		num1 = keyboard.nextInt();
		System.out.println("Enter the second number: ");
		num2 = keyboard.nextInt();
		
		//Processing
		sum = num1+num2;
		product = num1*sum;
		
		//Output
		System.out.println("The product is " + product);
		
		keyboard.close();
	}

}
