package com.trainee.trainee.entity;

public class Reverse_A_String {

    String name = "venkatesh";
	public static void main(String[] args) {
		 String name = "venkatesh";
		 char [] arr=name.toCharArray();
		for(int i=arr.length-1; i>0; i--) {
			System.out.println(arr[i]);
		}
	}
}
