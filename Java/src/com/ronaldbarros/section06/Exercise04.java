package com.ronaldbarros.section06;

import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		
		float height, ideal_weight;
		char sex;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your height: ");
		height = keyboard.nextFloat();
		System.out.println("Enter your sex(m/f): ");
		sex = keyboard.next().charAt(0);
		
		if(sex == 'm' || sex == 'M') {
			ideal_weight = (float) ((72.7 * height) - 58);	
			System.out.printf("Ideal weight: %.2f", ideal_weight);
		} else if(sex == 'f' || sex == 'F') {
			ideal_weight = (float) ((float) (62.1 * height) - 44.7);
			System.out.printf("Ideal weight: %.2f", ideal_weight);
		}else {
			System.out.print("Invalid option.");
		}
		
		keyboard.close();
	}

}
