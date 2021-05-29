package com.ronaldbarros.section08.arrays;

import java.util.Scanner;
import java.util.Vector;

public class Exercise06 {
    public static void main(String[] args) {

        int code;
        Vector<Float> vector = new Vector<>();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a code(0 , 1 or 2):");
        code = input.nextInt();

        if(code != 0 && code <= 2){

            for (int i = 0; i < 5; i++) {
                System.out.println("Enter a real number for the vector:");
                vector.add(input.nextFloat());
            }

            if(code == 1) {
                for (int i = 0; i < 5; i++) {
                    System.out.println(vector.get(i));
                }
            }else if(code == 2){
                for (int i = 4; i >= 0; i--){
                    System.out.println(vector.get(i));
                }
            }
        }
        input.close();
    }
}
