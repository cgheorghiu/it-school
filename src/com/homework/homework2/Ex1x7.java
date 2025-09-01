package com.homework.homework2;

import java.util.Scanner;

//Find the second-largest element in an array.
public class Ex1x7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please inser the length of the array( min 2): ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        int secondMax = 0;


        for (int i = 0; i < n; i++) {
            System.out.print("arr1[" + i + "] = ");
            arr[i] = sc.nextInt();

            if (i == 1) {
                max = arr[i] > arr[i-1] ? arr[i] : arr[i-1];
                secondMax = arr[i] > arr[i-1] ? arr[i-1] : arr[i];
            } else  {
                if (arr[i] > max) {
                    int temp = max;
                    max = arr[i];
                    secondMax = temp;
                } else {
                    secondMax = arr[i] > secondMax ? arr[i] : secondMax;
                }
            }
        }

        System.out.println("The elements of the array are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        if (secondMax < max) {
            System.out.println("\nThe second largest number is: " + secondMax);
        }  else {
            System.out.println("\nThe second largest number is equal to the largest number: " + max);
        }

    }
}
