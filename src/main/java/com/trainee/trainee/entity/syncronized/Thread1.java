package com.trainee.trainee.entity.syncronized;

public class Thread1 {

	Table t;
	
	public Thread1(Table t) {
		this.t=t;
	}
	public void run() {
		t.display(5);
	}
}