package com.homework.homework2;

//Find the maximum and minimum values in an integer array.

import java.util.Scanner;

public class Ex1x2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = 0, max = 0;

        for (int i = 0; i < arr.length; i++) {

            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();

            if (i == 0) {
                min = arr[i];
                max = arr[i];
            } else  {
//                min = Math.min(arr[i], arr[i - 1]);
//                max = Math.max(arr[i], arr[i + 1]);
                min = arr[i] < min ? arr[i] : min;
                max = arr[i] > max ? arr[i] : max;
            }
        }

        System.out.printf("The minimum is %d and the maximum is %d", min, max);

    }
}
