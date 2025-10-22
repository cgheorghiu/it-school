package com.homework.homework1;
//        1. Create a program to illustrate the importance of using the equals method for string comparison instead of
//        using the == operator. Show cases where == gives incorrect results due to String interning.

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}