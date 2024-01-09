package org.example;
//3. Reverse a String: Write a function to reverse a given string. For example,
//given the input "Hello", the output should be "olleH".
public class Code3 {
    public static void main(String[] args) {
        String word="hello";
        String reverse = "";
        for (int i=word.length()-1;i>=0;i--) {
            reverse=reverse+word.charAt(i);

        }
        System.out.println(reverse);

        //without for loop

        String str="java";
        StringBuffer sb=new StringBuffer(str);
        System.out.println(sb.reverse());
    }
}
