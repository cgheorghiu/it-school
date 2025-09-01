package com.homework.homework1;
//Create a program that demonstrates how to use equality operators in complex expressions, involving
//logical operators (&&, ||). Illustrate how to construct complex conditions using equality operators and
//logical operators.

public class Ex3 {
    public static void main(String[] args) {
        // === Primitive comparisons with logical operators ===
        int x = 5;
        int y = 10;
        int z = 5;

        // Using && (AND)
        if ((x == z) && (y != x)) {
            System.out.println("x equals z AND y is not equal to x.");
        } else {
            System.out.println("Condition with && did not hold.");
        }

        // Using || (OR)
        if ((x == y) || (x == z)) {
            System.out.println("Either x equals y OR x equals z (or both).");
        } else {
            System.out.println("Neither x==y nor x==z.");
        }

        // === Object comparisons in logical expressions ===
        String userInput = "admin";
        String password = "1234";

        // Complex condition: both username and password must match
        if (userInput.equals("admin") && password.equals("1234")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }

        // Alternative condition: allow either "admin" or "guest" user
        if (userInput.equals("admin") || userInput.equals("guest")) {
            System.out.println("Valid user detected.");
        } else {
            System.out.println("Unknown user.");
        }

        // === Combining primitives and objects ===
        int age = 20;
        String country = "Romania";

        // Condition: person must be 18+ AND from Romania
        if ((age >= 18) && country.equals("Romania")) {
            System.out.println("Eligible (18+ and from Romania).");
        } else {
            System.out.println("Not eligible.");
        }

        // Condition: either under 18 OR from Greece
        if ((age < 18) || country.equals("Greece")) {
            System.out.println("Special case: underage or Greek.");
        } else {
            System.out.println("No special case.");
        }
    }
}
