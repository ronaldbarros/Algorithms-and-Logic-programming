package com.ronaldbarros.section08.arrays;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {

        int[] vector = new int[10];

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            System.out.println("Enter a value:");
            vector[i] = input.nextInt();
        }

        for(int i = vector.length - 1; i >= 0; i--){
            System.out.printf("%d ", vector[i]);
        }

        input.close();
    }
}
