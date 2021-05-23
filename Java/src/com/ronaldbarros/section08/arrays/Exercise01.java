package com.ronaldbarros.section08.arrays;

import java.util.ArrayList;
import java.util.Scanner;


//even numbers in a range of values
public class Exercise01 {

	public static void main(String[] args) {
		
		int max, min;
		ArrayList<Integer> vector = new ArrayList<Integer>();
		ArrayList<Integer> even = new ArrayList<Integer>();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the minimum value:");
		min = input.nextInt();
		System.out.println("Enter the maximum value:");
		max = input.nextInt();
		
		for (int i = min; i <= max; i++) {
			vector.add(i);
			if(i % 2 == 0 && i != 0) {
				even.add(i);
			}
						
		}
		input.close();
		
		System.out.println("Minimum value: " + min);
		System.out.println("Maximum value: " + max);
		System.out.println("Range: " + (max-min));
		System.out.println("Even numbers:");
		System.out.println(even);

	}

}
