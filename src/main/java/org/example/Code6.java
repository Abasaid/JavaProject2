package org.example;
//6. Create a method to count how many vowels are present in a string
//“documentation”
public class Code6 {
    public static void main(String[] args) {
        String str="documentation";
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("The total number of vowels is "+count);
    }
}
