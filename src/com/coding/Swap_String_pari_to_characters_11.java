package com.coding;
public class Swap_String_pari_to_characters_11 {
	    public static void main(String[] args) {
	        String str = "Hello, world!";
	        
	        if (str == null || str.length() <= 1) {
	            System.out.println("Original string: " + str);
	            System.out.println("String after swapping pairs: " + str);
	            return;
	        }

	        char[] charArray = str.toCharArray();
	        for (int i = 0; i < charArray.length - 1; i += 2) {
	            char temp = charArray[i];
	            charArray[i] = charArray[i + 1];
	            charArray[i + 1] = temp;
	        }
	        
	        System.out.print("Original string: " + str + "\nString after swapping pairs: ");
	        System.out.println(charArray);
	    }
	}
