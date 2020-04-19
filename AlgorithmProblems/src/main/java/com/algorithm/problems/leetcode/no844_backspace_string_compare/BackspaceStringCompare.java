package com.algorithm.problems.leetcode.no844_backspace_string_compare;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        char[] sArray = S.toCharArray();
        char[] tArray = T.toCharArray();
        int sI = -1;
        int tI = -1;

        for (int i = 0; i < S.length(); i++) {
            if(sArray[i] != '#') {
                sArray[++sI] = sArray[i];
            } else if(sI > -1 || (i > 0 && sArray[i - 1] != '#')){
                sI--;
            }
        }

        for (int i = 0; i < T.length(); i++) {
            if(tArray[i] != '#') {
                tArray[++tI] = tArray[i];
            }else if(tI > -1 || (i > 0 && tArray[i - 1] != '#')){
                tI--;
            }
        }
        if (sI == -1 && tI == -1) {
            return true;
        } else if (sI != tI) {
            return false;
        } else {
            for (int i = 0; i < sI + 1; i++) {
                if (sArray[i] != tArray[i]) {
                    return false;
                }
            }
            return true;
        }

    }
}
