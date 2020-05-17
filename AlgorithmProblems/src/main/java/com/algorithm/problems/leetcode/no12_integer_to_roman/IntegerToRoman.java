package com.algorithm.problems.leetcode.no12_integer_to_roman;

import java.util.*;

public class IntegerToRoman {
    private Queue<RomanLetter> dictionary;

    public String inToRoman(int num) {
        this.generateRomanLetterDictionary();
        int number = num;
        StringBuilder result = new StringBuilder();
        int index = this.dictionary.size() - 1;
        while(number != 0 ) {
            RomanLetter romanDict = this.dictionary.poll();
            if(number >= romanDict.val) {
                int temp = number / romanDict.val;
                number = number % romanDict.val;
                for(int i = 0; i < temp; i++) {
                    result.append(romanDict.romanLetter);
                }
            }
        }
        return result.toString();
    }

    private void generateRomanLetterDictionary() {
        this.dictionary = new LinkedList<>();
        this.dictionary.add(new RomanLetter(1000, "M"));
        this.dictionary.add(new RomanLetter(900, "CM"));
        this.dictionary.add(new RomanLetter(500, "D"));
        this.dictionary.add(new RomanLetter(400, "CD"));
        this.dictionary.add(new RomanLetter(100, "C"));
        this.dictionary.add(new RomanLetter(90, "XC"));
        this.dictionary.add(new RomanLetter(50, "L"));
        this.dictionary.add(new RomanLetter(40, "XL"));
        this.dictionary.add(new RomanLetter(10, "X"));
        this.dictionary.add(new RomanLetter(9, "IX"));
        this.dictionary.add(new RomanLetter(5, "V"));
        this.dictionary.add(new RomanLetter(4, "IV"));
        this.dictionary.add(new RomanLetter(1, "I"));
    }
}

class RomanLetter {
    int val;
    String romanLetter;
    
    RomanLetter(int val, String r) {
        this.val = val;
        this.romanLetter = r;
    }
}
