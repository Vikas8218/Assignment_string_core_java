package com.coding;

public class Reverse_String_name_5 {

	public static void main(String[] args) {
		String str ="Vikas";
		String  temp="";
		for(int i=str.length()-1;i>=0;i--) {
			temp =temp+str.charAt(i);
			
		}
		System.out.println(temp);
	}

}
