package com.homework.homework1;

import java.util.Scanner;

//Create a program that reads a character from the user and uses nested if statements to determine if the
//character is a lowercase letter, an uppercase letter, a digit, or a special character.
public class Ex5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please press a key: ");

        char ch = sc.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            if (ch >= 'A' && ch <= 'Z') {
                System.out.println(ch + " is an UPPERCASE letter.");
            } else {
                System.out.println(ch + " is a lowercase letter.");
            }
        } else {
            if (ch >= '0' && ch <= '9') {
                System.out.println(ch + " is a digit.");
            } else {
                System.out.println(ch + " is a special character.");
            }
        }

    }
}
