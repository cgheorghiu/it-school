package com.homework.homework2;

import java.util.Scanner;

//Declare an array of 10 integers. Read values from the keyboard and print them in reverse order.
public class Ex1x1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Please insert 10 numbers!");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Numbers in reverse order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}