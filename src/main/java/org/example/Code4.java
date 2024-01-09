package org.example;
//4. Check if a String is Palindrome: Determine whether a given string is a
//palindrome, which means it reads the same forwards and backward. For
//example, "madam" is a palindrome
public class Code4 {
    public static void main(String[] args) {
        String word="Java";
        String reverse = "";
        for (int i=word.length()-1;i>=0;i--) {
            reverse=reverse+word.charAt(i);

        }
        if (word.equalsIgnoreCase(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
