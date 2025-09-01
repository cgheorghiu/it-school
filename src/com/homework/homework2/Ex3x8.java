package com.homework.homework2;

import java.util.Scanner;

//Check if a matrix is symmetric (equals its transpose).
public class Ex3x8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns in the matrix: ");
        int columns = sc.nextInt();

        int[][] arr = new int[rows][columns];
        boolean isEqual = true;

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

        System.out.println("The transpose of the matrix is: ");
        for (int i = 0; i < columns; i++){
            for(int j = 0; j < rows; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }

        if (columns != rows) {
            System.out.println("The transpose of the matrix is not equal to the original matrix");
        } else {
            for (int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++){
                    if (arr[i][j] != arr[j][i]){
                        isEqual = false;
                        break;
                    }
                }
            }
        }

        System.out.println("The transpose of the matrix " + (isEqual ? "is" : "is not equal") + " to the original matrix");
    }
}
