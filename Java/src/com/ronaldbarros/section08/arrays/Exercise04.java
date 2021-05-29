package com.ronaldbarros.section08.arrays;

import java.util.Scanner;
import java.util.Vector;

public class Exercise04 {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();
        int sum = 0;

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 6; i++){
            System.out.printf("Enter a value for the vector (%d/6):\n", i+1);
            vector.add(input.nextInt());
            sum += vector.get(i);
        }

        System.out.println("Vector is: " + vector);
        System.out.println("Sum of the values is: " + sum);

        input.close();
    }
}
