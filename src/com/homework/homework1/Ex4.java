package com.homework.homework1;
//Create a simple program that takes a number as input and uses if-else statements to categorize the
//number as "positive," "negative," or "zero."

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert an integer: ");
        int a = sc.nextInt();

        if (a > 0) {
            System.out.println(a + " is a positive integer");
        } else if (a < 0) {
            System.out.println(a + " is a negative integer");
        } else {
            System.out.println(a + " is zero");
        }
    }
}
