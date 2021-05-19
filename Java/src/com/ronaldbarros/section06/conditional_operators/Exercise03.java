package com.ronaldbarros.section06.conditional_operators;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		int p = 0, i = 0, number;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		number = keyboard.nextInt();
		
		if(number % 2 == 0) {
			p = number;
			System.out.println(p+" is even");
		}else {
			i = number;
			System.out.println(i+" is odd");
		}
		
		keyboard.close();
	}

}
