package com.homework.homework2;

import java.util.Scanner;

//Multiply every element of a matrix by a given constant.
public class Ex3x5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];
        System.out.print("Enter the number to multiply the elements in the matrix with: ");
        int c = sc.nextInt();

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print("arr[" + (i+1) + ", " + (j+1) + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The normal matrix is: ");
        for (int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The multiplied with constant matrix is: ");
        for (int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                arr[i][j] = arr[i][j] * c;
                System.out.print(arr[i][j]  + " ");
            }
            System.out.println();
        }


    }
}
