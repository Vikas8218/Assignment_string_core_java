package com.coding;
public class Iterate_String_8 {
    public static void main(String[] args) {
        String str = "Hello, world!";
        System.out.println("Using a for loop:");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }
}
