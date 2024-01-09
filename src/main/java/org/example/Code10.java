package org.example;

import java.util.ArrayList;

//10. How can you remove all duplicates from ArrayList?
public class Code10 {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Orange");
        items.add("Kiwi");
        items.add("Apple");
        items.add("Apricot");
        items.add("Kiwi");

        System.out.println("Before: ");
        items.forEach(a-> System.out.println(a+" "));

        for (int i = 0; i < items.size(); i++) {
            for(int j = i+1; j < items.size(); j++ ){
                if(items.get(i).equals(items.get(j))){
                    items.remove(j);
                    j--;
                }
            }
        }
        System.out.println("After: ");
        items.forEach(b-> System.out.println(b+" "));
    }
}
