package com.coding;

public class Anagram_String_4 {

	public static void main(String[] args) {
		String str1 ="LISTEN";
		String str2 ="SLIENH";
		int count =0;
		StringBuilder sb =new StringBuilder(str1);
		if(str1.length()==str2.length()) {
			  //str1 = str1.toLowerCase(); 
	          //str2 = str2.toLowerCase(); 
			for(int i=0;i<str1.length();i++) {
			for(int j =0;j<str2.length();j++) {
				if(str1.charAt(i)==str2.charAt(j)) {
					sb.setCharAt(j, '*');
					count++;
				}
			}
			}
			if(str1.length()==count)
				System.out.println("Anagram Number ");
			else
				System.out.println("Not anagram number");
		}else {
			System.out.println("Anagram Not length equals !!");
		}

	}

}
