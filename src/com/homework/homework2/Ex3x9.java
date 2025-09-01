package com.homework.homework2;

import java.util.Scanner;

//Find the maximum element in a matrix and its position (row, column).
public class Ex3x9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns in the matrix: ");
        int columns = sc.nextInt();

        int[][] arr = new int[rows][columns];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print("arr[" + (i+1) + ", " + (j+1) + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }

        int max = arr[0][0];
        int indexR = 0;
        int indexC = 0;


        System.out.println("The normal matrix is: ");
        for (int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if (arr[i][j] > max){
                    max = arr[i][j];
                    indexR = i;
                    indexC = j;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The maximum number is " + max + " and it is element arr[" + (indexR + 1) + ", " + (indexC + 1) + "] in the array.");
    }
}
