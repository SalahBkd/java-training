package com.salahbkd.ads.stacks;

import java.util.Stack;

public class Expression {

    public static boolean checkForBalancedExprs(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (isLeftBracket(i, str)) {
                stack.push(str.charAt(i));
            } else if (isRightBracket(i, str)) {
                if (stack.empty())
                    return false;
                char top = stack.pop();
                if (bracketsMatched(i, top, str))
                    return false;
            }
        }
        return stack.isEmpty();
    }

    private static boolean bracketsMatched(int charIndex, char top, String str) {
        return ((str.charAt(charIndex) == ')' && top != '(') || (str.charAt(charIndex) == '}' && top != '{')
                || (str.charAt(charIndex) == ']' && top != '['));
    }

    private static boolean isRightBracket(int charIndex, String str) {
        return (str.charAt(charIndex) == ')' || str.charAt(charIndex) == '}' || str.charAt(charIndex) == ']');
    }

    private static boolean isLeftBracket(int charIndex, String str) {
        return (str.charAt(charIndex) == '(' || str.charAt(charIndex) == '{' || str.charAt(charIndex) == '[');
    }
}
