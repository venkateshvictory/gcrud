package com.trainee.trainee.entity.syncronized;

public class Table {

	public synchronized void display(int n) {
		for(int i=0; i<10; i++) {
			System.out.println(n*i);
		}
	}
} 
