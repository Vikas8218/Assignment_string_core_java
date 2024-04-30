package com.coding;

import java.util.Scanner;

public class Splitting_a_string {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in) ;
			
		String str ="ABCDEFGHIJKLMNOPURSTUVWXYZ";
		System.out.println("Enter a number :");
	     int num =sc.nextInt();
	     int len =str.length()/num;
	      int m=0;
	      for(int i=0;i<num;i++) {
	    	  for(int j=0;j<len;j++) {
	    		 System.out.print(str.charAt(m));
	    		 m++;
	    	  
	      }
	     
      System.out.println();
	}

}
}
