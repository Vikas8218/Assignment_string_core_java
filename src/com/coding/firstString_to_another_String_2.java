package com.coding;

public class firstString_to_another_String_2 {

	public static void main(String[] args) {
		String str1 ="I am a Student in iftm University Moradabad";
		String str2 =" ";
		for(int i=0;i<str1.length();i++) {
			str2 =str2+str1.charAt(i);
			
		}
			
		System.out.println(str2);

	}

}
