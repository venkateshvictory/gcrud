package com.trainee.trainee.entity;

import org.hibernate.internal.build.AllowSysOut;

public class SimpleOverloading {

	
	
	public static void main(String[] args) {
		SimpleOverloading overloading = new SimpleOverloading();
		int sumofsingle=overloading.sum(10);
		int sumofTwo=overloading.sum(20, 30);
		System.out.println(sumofsingle);
		System.out.println(sumofTwo);

	}
	
	public int sum(int i)
	{
		return i+2;
	}
	
	public int sum(int i,int j) {
		return i+j;
	}
	
}
