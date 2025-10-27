package com.itschool.session6.homework.paranthesis_ex20;

import java.util.Scanner;

public class ParanthesisChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String str = sc.nextLine();
        boolean isBalanced = BalancedParenthesisChecker.isBalanced(str);

        System.out.println("The balance of " + str + " is " + isBalanced);



    }


}
