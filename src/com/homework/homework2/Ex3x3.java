package com.homework.homework2;

import java.util.Scanner;

//Find the sum of the main diagonal and the secondary diagonal of a square matrix.
public class Ex3x3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Insert the number of rows and columns for the square matrix: ");
        int dimension = sc.nextInt();
        int[][] arr = new int[dimension][dimension];
        int mainDiagonal = 0;
        int secondaryDiagonal = 0;

        for (int i = 0; i < dimension; i++){
            for(int j = 0; j < dimension; j++){
                System.out.print("arr[" + (i+1) + ", " + (j+1) + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < dimension; i++){
            for(int j = 0; j < dimension; j++){
                System.out.print(arr[i][j] + " ");
            }
            mainDiagonal = mainDiagonal + arr[i][i];
            secondaryDiagonal = secondaryDiagonal + arr[dimension - i - 1][i];
            System.out.println();
        }

        System.out.println("mainDiagonal = " + mainDiagonal);
        System.out.println("secondaryDiagonal = " + secondaryDiagonal);
    }
}
