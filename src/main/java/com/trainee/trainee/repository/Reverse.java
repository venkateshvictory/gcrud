package com.trainee.trainee.repository;

public class Reverse {

	public static void main(String[] args) {
		
		String name ="venkatesh";
	char[]	ch=name.toCharArray();
	         
         for(int i=ch.length-1; i>=0; i--) {
        	 System.out.println(ch[i]);
         }
	}
         
		
}
