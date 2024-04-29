package com.coding;

    public class even_Length_word_1 {

    public static void main(String[] args) {
        String str ="Ram is a good boy";
        int count = 0;
        int start = 0;

        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' ') {
                String word = str.substring(start, i);
                if (word.length() % 2 == 0) {
                    System.out.println(word);
                    count++;
                }
                start = i++;
            }
        }
        System.out.println("Count of even-length words: " + count);
    }
}
