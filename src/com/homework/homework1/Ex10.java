package com.homework.homework1;

import java.util.Scanner;

//Create a program that takes three numbers as input and uses the ternary operator to
//find and print the largest number among them.
public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int largest = (a >= b)
                ? (a >= c ? a : c)
                : (b >= c ? b : c);

        System.out.println("The largest number is: " + largest);
    }
}
