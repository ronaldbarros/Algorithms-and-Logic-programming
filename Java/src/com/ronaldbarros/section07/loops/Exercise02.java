package com.ronaldbarros.section07.loops;

//multiples of 3
public class Exercise02 {

	public static void main(String[] args) {
				
		for(int i = 1; i <= 100; i++) {
			
			if(i % 3 == 0) {
				System.out.printf(i+" is multiple of 3\n");
			}else {
				System.out.println(i);
			}
		}

	}

}
