package com.trainee.trainee.entity;

public class EvenNumbersUpto100 {

	public static void main(String[] args) {
		int value =100;
		for(int i=0; i<value; i++) {
			if(i%2==0) {
				System.out.println(i);
			}else {
				System.out.println("not have prime numbers");
			}
		}
	}
}
