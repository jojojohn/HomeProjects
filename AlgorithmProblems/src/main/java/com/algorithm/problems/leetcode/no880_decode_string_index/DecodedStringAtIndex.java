package com.algorithm.problems.leetcode.no880_decode_string_index;

public class DecodedStringAtIndex {

    // Brute force with memory leak
    public String decodeAtIndex(String S, int K) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) >= '0' && S.charAt(i) <= '9' && !(stringBuilder.length() == 0)) {
                int number = Integer.valueOf(String.valueOf(S.charAt(i)));
                String temp = stringBuilder.toString();
                if (temp.length() > K) {
                    break;
                }
                for(int j = 0; j < number - 1; j++) {
                    stringBuilder.append(temp);
                }
            } else {
                stringBuilder.append(S.charAt(i));
            }
        }
        String s = stringBuilder.toString();
        return String.valueOf(s.charAt(K - 1));
    }
}
