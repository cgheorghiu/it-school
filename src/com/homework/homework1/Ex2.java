package com.homework.homework1;
//Develop a program that uses equality operators inside conditional statements (like if-else) to branch the code
//based on the equality of variables. Use both primitive data types and objects in your examples.

public class Ex2 {
    public static void main(String[] args) {
        // === Primitive comparisons ===
        int a = 10;
        int b = 10;
        int c = 20;

        if (a == b) {
            System.out.println("a and b are equal (primitives).");
        } else {
            System.out.println("a and b are NOT equal (primitives).");
        }

        if (a == c) {
            System.out.println("a and c are equal (primitives).");
        } else {
            System.out.println("a and c are NOT equal (primitives).");
        }

        // === Object comparisons ===
        String s1 = new String("hello"); // explicitly creating new objects
        String s2 = new String("hello");
        String s3 = s1; // reference to the same object

        if (s1 == s2) {
            System.out.println("s1 and s2 are the SAME object in memory.");
        } else {
            System.out.println("s1 and s2 are DIFFERENT objects in memory.");
        }

        if (s1.equals(s2)) {
            System.out.println("s1 and s2 have the same content.");
        } else {
            System.out.println("s1 and s2 do NOT have the same content.");
        }

        if (s1 == s3) {
            System.out.println("s1 and s3 are the SAME object in memory.");
        } else {
            System.out.println("s1 and s3 are DIFFERENT objects in memory.");
        }
    }
}
