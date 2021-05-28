package com.ronaldbarros.section08.arrays;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {

        int[] vecto1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.println("Enter a value for Vector 1:");
            vecto1[i] = input.nextInt();
            System.out.println("Enter a value for vector 2:");
            vector2[i] = input.nextInt();

            vector3[i] = vecto1[i]+vector2[i];
        }

        for(int i = 0; i < 5; i++){
            System.out.printf("%d ", vector3[i]);
        }

        input.close();
    }
}
