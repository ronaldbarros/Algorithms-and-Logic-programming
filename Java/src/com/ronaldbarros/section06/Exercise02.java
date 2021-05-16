package com.ronaldbarros.section06;

import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		
		int a, b, value;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a positive or negative value: ");
		value = keyboard.nextInt();
		
		if(value > 0) {
			a = value;
			System.out.println(a+" is positive");
		}else {
			b = value;
			System.out.println(b+" is negative");
		}
		
		keyboard.close();		
	}

}
