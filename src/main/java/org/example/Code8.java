package org.example;

import java.util.ArrayList;

//8. You have a list of strings and you want to keep only those that start with
//“A” and you want to return them in lower case".
public class Code8 {
    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<>();
        str.add("Akram");
        str.add("Anas");
        str.add("Ahmed");
        str.add("Omar");
        str.add("Kevin");
        str.add("Amina");
        for (int i = 0; i < str.size(); i++) {
            String s= str.get(i);
            if (s.startsWith("A")){
                System.out.println(str.get(i).toLowerCase());
            }else{
                str.remove(s);
            }
        }
    }
}
