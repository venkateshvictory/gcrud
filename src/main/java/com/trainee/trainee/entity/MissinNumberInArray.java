package com.trainee.trainee.entity;

public class MissinNumberInArray {

	public static void main(String[] args) {
		int n=6;
		int a[] = {1,2,4,5,6};
		int sumN = (n*(n+1)/2);
		int sum =0;
		for(int i=0; i<a.length; i++) {
			sum = sum+a[i];
		}
		int missValue = sumN-sum;
		System.out.println(missValue);
	}
}
