package com.ronaldbarros.section03;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		//Variables
		int minimum, maximum;
		float avg;
		Scanner keyb = new Scanner(System.in);
		
		//Input
		System.out.println("Enter the minimum stock:");
		minimum = keyb.nextInt();
		System.out.println("Enter the maximum stock:");
		maximum = keyb.nextInt();
		
		avg = (minimum + maximum)/2;
		
		//Output
		System.out.print("Average stock: " + avg);
		
		keyb.close();

	}

}
