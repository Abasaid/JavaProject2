package org.example;

import java.util.Arrays;

//5. Check if Two Strings are Anagrams: Given two strings, determine if they
//are anagrams, meaning they contain the same characters in a different order.
//For example, "listen" and "silent" are anagrams
public class Code5 {
    public static void main(String[] args) {
        String str1="silent";
        String str2="listen";

        char[] charArr1 = str1.toLowerCase().toCharArray();
        char[] charArr2 = str2.toLowerCase().toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        boolean isAnagram = Arrays.equals(charArr1, charArr2);

        if (isAnagram) {
            System.out.println("They are anagram.");
        } else {
            System.out.println("They are NOT anagram.");

        }

    }
}
