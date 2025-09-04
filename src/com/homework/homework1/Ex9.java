package com.homework.homework1;

import java.util.Scanner;

//Enhance the program from problem 8 to also identify zero separately using nested ternary operators.
public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String result = (num > 0) ? "positive" : num == 0 ? "zero" : "negative";

        System.out.println(num + " is " + result);

    }
}
