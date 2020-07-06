package com.algorithm.problems.permutation;

import java.util.LinkedList;
import java.util.List;

public class Permutation {

    public List<String> permute(String input) {
        List<String> result = new LinkedList<>();
        char[] stringArray = input.toCharArray();
        this.permuteString(stringArray, result, 0);
        return result;
    }

    private void permuteString(char[] str, List<String> result, int l) {
        if (l == str.length) {
            result.add(new String(str));
        }

        for (int i = l; i < str.length; i++) {
            swap(str, l, i);
            permuteString(str, result, l + 1);
            swap(str, l, i);
        }
    }

    private void swap(char[] str, int i, int l) {
        char temp = str[i];
        str[i] = str[l];
        str[l] = temp;
    }
}
