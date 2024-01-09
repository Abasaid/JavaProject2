package org.example;
//7. Count the Number of Words in a String: Write a function to count the
//number of words in a given string. Words are separated by spaces or
//punctuation. For example, the input "Hello, world!" should return 2.
public class Code7 {
    public static void main(String[] args) {
        String str="Java programming needs lots of practice";
        String [] strArr=str.split("\\s");
        System.out.println("Words: "+strArr.length);
    }
}
