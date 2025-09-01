package com.homework.homework2;

import java.util.Scanner;

//Copy all elements from one array into another.
public class Ex1x4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please inser the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arrCopy = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Copied array elements:");

        for (int i = 0; i < n; i++) {
            arrCopy[i] = arr[i];
            System.out.print(arrCopy[i] + " ");
        }

    }
}
