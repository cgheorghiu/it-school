package com.homework.homework2;

import java.util.Scanner;
//Reverse an array in place (without using a second array).
public class Ex1x5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please inser the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length / 2 ; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println("The reversed array is: ");
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }
}
