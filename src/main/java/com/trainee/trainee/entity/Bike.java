package com.trainee.trainee.entity;

public class Bike extends Vehicle{

	       
	public static void main(String[] args) {
            Bike obj = new Bike();
            obj.run();
            Vehicle obj1 = new Bike();
            obj1.run();
            
//            Bike obj2 = (Bike) new Vehicle();
//            obj2.run();
	}

}
