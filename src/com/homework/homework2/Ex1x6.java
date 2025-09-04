package com.homework.homework2;

import java.util.Scanner;

//Merge two arrays of the same size into one (concatenation)
public class Ex1x6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert the length of both arrays: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] mergedArray = new int[n*2];


        System.out.println("Please insert the elements of the first array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("arr1[" + i + "] = ");
            arr1[i] = sc.nextInt();
        }

        System.out.println("Please insert the elements of the second array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("arr2[" + i + "] = ");
            arr2[i] = sc.nextInt();
        }

        System.out.println("This is the merged array: ");
        for (int i = 0; i < mergedArray.length; i++) {
            mergedArray[i] = i < n ? arr1[i] : arr2[i - n];
            System.out.print(mergedArray[i] + " ");
        }
    }

}
