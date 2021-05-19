package com.ronaldbarros.section06.conditional_operators;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float earnings, additional;
		int code, hours, overtime = 0;
		
		System.out.println("Enter employee code: ");
		code = input.nextInt();
		System.out.println("Working hours per week: ");
		hours = input.nextInt();
		
		if (hours > 44) {
			overtime = hours - 44;
			hours = hours - overtime;
		}
		
		earnings = hours * 10;
		additional = overtime * 20;
		
		System.out.println("Earnings: $" + earnings);
		System.out.println("Overtime: " + overtime + " hours");
		System.out.println("Additional: $" + additional);
		
		input.close();
	}

}
