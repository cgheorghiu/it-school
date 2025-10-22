package com.itschool.session6.homework.romanNumerals_ex21;

import java.util.Scanner;

public class RomanNumerals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        String roman = Int2RomanNumerals.intToRoman(num);

        System.out.println(num + " is converted to " + roman);

    }
}
