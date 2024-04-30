package com.coding;

public class Palindrom_String_3 {

	public static void main(String[] args) {
		String str = "MADAM";
		String str1 ="";
		for(int i=str.length()-1;i>=0;i--) {
			str1  =str1+str.charAt(i);
		}
		if(str.equals(str1)) {
			System.out.println("It is palindrom number");
		}
			else
				System.out.println("It is not palindrom number");
		

	}

}
