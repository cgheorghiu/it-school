package com.homework.homework2;

import java.util.Scanner;

//Find the sum of all elements in a matrix.
public class Ex3x2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Insert the number of columns: ");
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];
        int sum = 0;

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print("arr[" + (i+1) + ", " + (j+1) + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++){
            int sumRow = 0;
            for(int j = 0; j < columns; j++){
                sumRow += arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            sum += sumRow;
            System.out.println();
        }

        System.out.println("The sum of all the elements in the matrix is: " + sum);
    }
}
