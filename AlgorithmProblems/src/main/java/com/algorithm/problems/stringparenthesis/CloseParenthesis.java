package com.algorithm.problems.stringparenthesis;

public class CloseParenthesis {

    public int findCloseParenthesis(String str, int openParenthesisIndex) {
        int openParenthesis = 0;
        for (int i = openParenthesisIndex - 1 ; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                openParenthesis++;
            } else if (str.charAt(i) == ')') {
                openParenthesis--;
                if (openParenthesis == 0) {
                    return i + 1;
                }
            }
        }
        return -1;
    }
}
