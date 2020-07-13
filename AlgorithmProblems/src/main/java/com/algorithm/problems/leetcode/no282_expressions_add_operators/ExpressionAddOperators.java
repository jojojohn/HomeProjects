package com.algorithm.problems.leetcode.no282_expressions_add_operators;

import java.util.LinkedList;
import java.util.List;

public class ExpressionAddOperators {

    public List<String> addOperators(String num, int target) {
        List<String> result = new LinkedList<>();
        findRecOperations(num, 0, "", target, result);
        return result;
    }

    private void findRecOperations(String num, int prevRes, String prevOperation, int target, List<String> result) {

        for (int i = 0; i < num.length() - 1; i++) {
            int num_1 = Integer.parseInt(num.substring(0, i + 1));
            if (prevOperation == "") {
                prevOperation = String.valueOf(num_1);
                prevRes = num_1;
            }
            num = num.substring(i + 1, num.length());
            int num_2 = Integer.parseInt(num);
            int num_3 = Integer.parseInt(String.valueOf(num.charAt(0)));
            int res = 0;
            // substract
            res = prevRes - num_2;
            if (res == target) {
                result.add(prevOperation + "-" + num_2);
            }
            findRecOperations(num, prevRes - num_3, prevOperation + "-" + num_3, target, result);

            // addition
            res = prevRes + num_2;
            if (res == target) {
                result.add(prevOperation + "+" + num_2);
            }
            findRecOperations(num, prevRes + num_3, prevOperation + "+" + num_3, target, result);

            // multiplication
            res = prevRes * num_2;
            if (res == target) {
                result.add(prevOperation + "*" + num_2);
            }
            findRecOperations(num, prevRes * num_3, prevOperation + "*" + num_3, target, result);
        }
    }
}
