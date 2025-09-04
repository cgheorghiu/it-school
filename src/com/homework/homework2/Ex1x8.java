package com.homework.homework2;

import java.util.Scanner;

//Shift all elements of an array to the left by 1 position (the first element becomes the last).
public class Ex1x8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert the length of the array( min 2): ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("arr1[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        System.out.println("The elements of the array are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        int first = arr[0];

        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[n - 1] = first;

        System.out.println("\nArray after left shift:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
