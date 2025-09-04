package com.homework.homework2;

import java.util.Scanner;

//Read a 3x3 matrix from the keyboard and print it.
public class Ex3x1 {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        int[][] arr  = new int[3][3];

        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("arr[" + (i+1) + ", " + (j+1) + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
