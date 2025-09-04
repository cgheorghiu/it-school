package com.homework.homework1;

import java.util.Scanner;

//Create a program that takes a number as input and uses the ternary operator to print whether
//the number is "positive" or "non-positive".
public class Ex8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String result = (num > 0) ? "positive" : "negative";

        System.out.println(num + " is " + result);

    }
}
