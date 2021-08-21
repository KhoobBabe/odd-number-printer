package com.khubaib;

import java.util.Scanner;
import java.util.Arrays;

public class OddNum {

    public static void main(String[] args) {

        //Declaring input
        Scanner input = new Scanner(System.in);

        //Declaring variables
        int total;
        int quo;

        //size of the array
        System.out.println("How many numbers do u want in the array: ");
        total = input.nextInt();
        int array[] = new int [total];

        System.out.println("Enter the number in array: ");

        //entering the elements in the array
        for (int i = 0 ; i <total; i++){
            array[i] = input.nextInt();
        }

        //declaring another array
        int[] odds = new int[array.length];

        //entering only odd number in the new array
        for (int i = 0; i < total; i++){

            quo = array[i]%2;

            if (quo != 0){

                odds[i] = array[i];

            }
        }

        //sorting the new array
        Arrays.sort(odds);

        System.out.println("THE ODD NUMBERS IN THE ARRAY ARE:");

        //printing the array in descending order
        for (int i = odds.length; i >= 0; i--){
            if (odds[i-1] != 0){
                System.out.println(odds[i-1]);
            }
        }
    }

}

