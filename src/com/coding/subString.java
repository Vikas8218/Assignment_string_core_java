package com.coding;

public class subString {

    public static void main(String[] args) {
        String str = "Ram is a good boy";
        String sb = "";
        String word = "Ram ";
        str = str + " ";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word = word + ch;
            } else {
                if (word.length() % 2 == 0) {
                    sb = sb + word + " ";
                }
                word = "";
            }
        }
        System.out.print(sb);
    }
}
