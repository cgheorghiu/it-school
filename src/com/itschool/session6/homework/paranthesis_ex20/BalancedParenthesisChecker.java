package com.itschool.session6.homework.paranthesis_ex20;

public class BalancedParenthesisChecker {

    public static boolean isBalanced(String str) {
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                sb.append(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (sb.isEmpty()) {
                    return false;
                }

                char last = sb.charAt(sb.length() - 1);

                if ((ch == ')' && last == '(') ||
                        (ch == '}' && last == '{') ||
                        (ch == ']' && last == '[')) {
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    return false;
                }
            }
        }

        return sb.isEmpty();
    }
}
