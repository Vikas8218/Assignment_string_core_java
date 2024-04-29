package com.coding;

public class String_to_Stringarray_10 {

	public static void main(String[] args) {
		String str ="Ram is good boy";
		String[] ch=str.split(" ");
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]+" ");
		}
	}

}
