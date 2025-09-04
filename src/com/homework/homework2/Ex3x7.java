package com.homework.homework2;

import java.util.Scanner;
//Multiply two matrices (basic algorithm).
public class Ex3x7 {
    public static void main(String[] args) {

        System.out.println("In order to be able to calculate the product of two matrixes, " +
                "the number of the columns in the first matrix should be equal to the number of rows in the second matrix.");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows in the first matrix: ");
        int r1 = sc.nextInt();

        System.out.print("Enter the number of columns in the first matrix: ");
        int c1r2 = sc.nextInt();

        System.out.println("Enter the number of rows in the second matrix is: " + c1r2);

        System.out.print("Enter the number of columns in the second matrix: ");
        int c2 = sc.nextInt();

        int[][] arr1 = new int[r1][c1r2];
        int[][] arr2 = new int[c1r2][c2];
        int[][] product = new int[r1][c2];

        for (int i = 0; i < r1; i++){
            for (int j = 0; j < c1r2; j++){
                System.out.print("arr1[" + (i+1) + ", " + (j+1) + "] = ");
                arr1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < c1r2; i++){
            for (int j = 0; j < c2; j++){
                System.out.print("arr2[" + (i+1) + ", " + (j+1) + "] = ");
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("The first matrix is: ");
        for (int i = 0; i < r1; i++){
            for(int j = 0; j < c1r2; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The second matrix is: ");
        for (int i = 0; i < c1r2; i++){
            for(int j = 0; j < c2; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        // calculate the product of 2 matrix
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                product[i][j] = 0;
                for (int k = 0; k < c1r2; k++) {
                    product[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        System.out.println("Product of matrices:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }

    }
}
