package com.ronaldbarros.section06.conditional_operators;

import java.util.Scanner;

public class Exercise09 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float pollution_index;
		
		System.out.println("Enter the air pollution index: ");
		pollution_index = input.nextFloat();
		
		if (pollution_index >= 0.3 && pollution_index < 0.4) {
			System.out.println("Alert: Suspend activities of companies of group 1.");
		}else if (pollution_index >= 0.4 && pollution_index < 0.5) {
			System.out.println("Alert: Suspend activities of companies of groups 1 and 2.");
		}else if (pollution_index >= 0.5) {
			System.out.println("Alert: Suspend activities of all industry.");
		}else {
			System.out.println("Air quality is satisfactory.");
		}
		
		input.close();
	}

}
