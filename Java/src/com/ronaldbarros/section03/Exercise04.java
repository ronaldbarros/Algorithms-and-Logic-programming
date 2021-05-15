package com.ronaldbarros.section03;

import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		
		//Variables
		int a, b, sum;
		Scanner keyboard = new Scanner(System.in);
		
		//Input
		System.out.print("Enter the first number: ");
		a = keyboard.nextInt();
		
		System.out.print("Enter the second number: ");
		b = keyboard.nextInt();
		
		//Processing
		sum = a + b;
		
		//Output
		System.out.print("The sum is " + sum);
		
		keyboard.close();
	}

}
