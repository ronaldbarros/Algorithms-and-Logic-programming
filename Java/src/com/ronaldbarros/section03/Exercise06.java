package com.ronaldbarros.section03;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		float salary, sl_week;
		int hours;
		Scanner entry = new Scanner(System.in);
		
		System.out.print("How many hours did you work this week? ");
		hours = entry.nextInt();
		
		System.out.print("How much do you earn per hour? ");
		salary = entry.nextFloat();
		
		sl_week = salary * hours;
		
		System.out.print("Your earnings this week are " + sl_week + " dollars");
		
		entry.close();

	}

}
