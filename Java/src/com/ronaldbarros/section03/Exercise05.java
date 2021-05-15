package com.ronaldbarros.section03;

import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {
		
		int m, cm;
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter the value in meters: ");
		m = kb.nextInt();
		
		cm = m * 100;
		
		System.out.print(m+"m = " +cm +"cm");
		
		kb.close();
	}

}
