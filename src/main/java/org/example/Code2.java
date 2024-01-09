package org.example;
//2. Find out how many alpha characters are present in a string?
public class Code2 {
    public static void main(String[] args) {
        String mix="Java2024Programming!!#01010";
        String alpha=mix.replaceAll("[^A-Za-z]","");
        System.out.println(alpha.length());
    }
}
