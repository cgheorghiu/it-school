package com.homework.homework1;

//Develop a program that uses a for loop to count the number of even and
//odd numbers in a range from 1 to n, where n is input by the user. Print
//the counts.

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int countOdds = 0;
        int countEvens = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + (i ) + "] =  ");
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                countOdds++;
            } else  {
                countEvens++;
            }
        }

        System.out.println("\nThis is the array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.printf("\nIn this array there are %d odd numbers and %d even numbers.", countOdds, countEvens);

    }
}
