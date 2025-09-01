package com.homework.homework1;

//Write a program that uses a for loop to find all the factors of a number n,
//where n is a user-input number. Print all factors in a single line separated by a space.
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }
    }
}
