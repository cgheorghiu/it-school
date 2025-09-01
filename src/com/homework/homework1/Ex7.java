package com.homework.homework1;

import java.util.Scanner;

//Create a program that uses an enhanced for loop to find and print the sum of all elements in an array.
public class Ex7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        //Define the array
        for(int i = 0; i < n; i++) {

            System.out.print("arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        //Display the array and calculate sum
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            System.out.print((arr[i] + "\t"));
        }

        System.out.println("\nSum = " + sum);
    }
}
