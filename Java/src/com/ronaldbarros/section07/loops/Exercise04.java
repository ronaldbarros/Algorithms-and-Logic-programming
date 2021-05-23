package com.ronaldbarros.section07.loops;

import java.util.Scanner;

public class Exercise04 {
	
	public static void main(String[] args) {
		
		float number, max = -9999999, min = 9999999, sum = 0, avg;
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter a number: ");
			number = input.nextFloat();
			
			sum = sum + number;
			
			if(number > max) {
				max = number;
			}
			if(number < min) {
				min = number;
			}
			
		}
		avg = sum / 10;
		
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
		System.out.println("Average: " + avg);
		input.close();
	}

}
