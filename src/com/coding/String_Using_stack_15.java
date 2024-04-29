package com.coding;

import java.util.Stack;

public class String_Using_stack_15 {

	public static void main(String[] args) {
		String str ="RAMAN";
		Stack<Character> sb =new Stack<>();
		for(int i=0;i<str.length();i++) {
			sb.push(str.charAt(i));
			while(!sb.isEmpty()) {
				System.out.print(sb.pop());
			}
		}
	}

}
