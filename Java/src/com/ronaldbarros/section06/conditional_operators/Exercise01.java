package com.ronaldbarros.section06.conditional_operators;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		int n;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a value: ");
		n = keyboard.nextInt();
		
		if(n > 100) { 
			System.out.println(n);
		}else {
			System.out.println(0);
		}
		
		keyboard.close();

	}

}
