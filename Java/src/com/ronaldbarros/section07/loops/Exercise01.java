package com.ronaldbarros.section07.loops;

import java.util.Scanner;

public class Exercise01 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int bigger = 0, number;
		
		do {
			System.out.println("Enter a number: ");
			number = input.nextInt();
			if (number > bigger) {
				bigger = number;
			}
			
		}while(number != 0);
				
		System.out.println(bigger);
		
		input.close();
	}

}
