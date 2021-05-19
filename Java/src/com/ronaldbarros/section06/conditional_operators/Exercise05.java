package com.ronaldbarros.section06.conditional_operators;

import java.util.Scanner;

public class Exercise05 {
	
	public static void main(String[] args) {
		
		float weight, overweight, fee;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Fish's weight: ");
		weight = keyboard.nextFloat();
		
		if(weight > 50) {
			overweight = weight - 50;
			fee = overweight * 4;
			System.out.println("Weight: " + weight);
			System.out.println("Overweight: " + overweight);
			System.out.println("Fee: US$ " + fee);
		}else {
			System.out.println("Weight: " + weight);
		}
		keyboard.close();
	}

}
