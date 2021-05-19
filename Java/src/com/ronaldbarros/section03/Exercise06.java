package com.ronaldbarros.section03;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		float salary, sl_week;
		int hours;
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many hours did you work this week? ");
		hours = input.nextInt();
		
		System.out.print("How much do you earn per hour? ");
		salary = input.nextFloat();
		
		sl_week = salary * hours;
		
		System.out.print("Your earnings this week are " + sl_week + " dollars");
		
		input.close();

	}

}
