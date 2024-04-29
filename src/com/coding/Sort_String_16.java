package com.coding;

public class Sort_String_16 {

	public static void main(String[] args) {
		String str="progarm";
	  char[] arr = str.toCharArray();
	  for(int i=0;i<arr.length;i++) {
	  for(int j=0;j<arr.length-1;j++) {
		  if(arr[j]>arr[j+1]) {
			  char temp =arr[j];
			  arr[j]=arr[j+1];
			  arr[j+1]=temp;
		  }
	  }
	  }
	  System.out.println("Sort String!");
	  for(int i=0;i<arr.length;i++) {
	  System.out.print(arr[i]+" ");
	}
	  }
	}
