package com.ronaldbarros.section07.loops;

import java.util.Scanner;

//multiplication table

public class Exercise06 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.println("Enter an integer: ");
		number = input.nextInt();
		
		System.out.printf("Multiplication table of %d:\n\n", number);
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.printf("%d x %d = %d\n", number, i, number*i);
			
		}
		
		input.close();
	}

}
