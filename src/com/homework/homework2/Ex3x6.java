package com.homework.homework2;

import java.util.Scanner;

//Add two matrices of the same size.
public class Ex3x6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        int columns = sc.nextInt();
        int[][] arr1 = new int[rows][columns];
        int[][] arr2 = new int[rows][columns];
        int[][] sum = new int[rows][columns];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print("arr1[" + (i+1) + ", " + (j+1) + "] = ");
                arr1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print("arr2[" + (i+1) + ", " + (j+1) + "] = ");
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("The first matrix is: ");
        for (int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The second matrix is: ");
        for (int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The sum matrix is: ");
        for (int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }


    }
}
