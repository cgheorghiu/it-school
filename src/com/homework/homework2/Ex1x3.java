package com.homework.homework2;

import java.util.Scanner;

//Calculate the sum and average of an integer array.
public class Ex1x3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please inser the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        float avg = 0;

        for (int i = 0; i < n; i++){

            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
            sum += arr[i];

        }

        avg = (float) sum / n;

        System.out.println("The sum is " + sum);
        System.out.println("The average is " + avg);

    }
}
