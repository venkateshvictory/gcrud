package com.trainee.trainee.entity;

public class DuplicateNumbers {

	public static void main(String[] args) {
		String name= "venkatesh";
		char[] arr=name.toCharArray();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1; i<arr.length; i++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}
}
