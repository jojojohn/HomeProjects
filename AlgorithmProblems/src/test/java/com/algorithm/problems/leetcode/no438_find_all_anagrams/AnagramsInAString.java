package com.algorithm.problems.leetcode.no438_find_all_anagrams;

import java.util.ArrayList;
import java.util.List;

public class AnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        if (p.length() > s.length()) {
            return  new ArrayList<>();
        }
        int[] pMap = new int[26];
        int[] sMap = new int[26];
        List<Integer> result = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < p.length(); i++) {
            pMap[p.charAt(i) - 'a']++;
            sMap[s.charAt(i) - 'a']++;
        }

        for (int i =0; i < 26; i++) {
            if (pMap[i] == sMap[i]) {
                count++;
            }
        }
        int i = 0;
        for (; i < s.length() - p.length(); i++) {
            if (count == 26) {
                result.add(i);
            }
            int l = s.charAt(i) - 'a';
            int r = s.charAt(i + p.length()) - 'a';
            sMap[r]++;
            if(sMap[r] == pMap[r]) {
                count++;
            }
            if(sMap[r] == pMap[r] + 1) {
                count--;
            }
            sMap[l]--;
            if(sMap[l] == pMap[l]) {
                count++;
            }
            if(sMap[l] == pMap[l] - 1) {
                count--;
            }
        }
        if (count == 26) {
            result.add(i);
        }
        return result;
    }

}
