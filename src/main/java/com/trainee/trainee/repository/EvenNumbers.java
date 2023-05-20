package com.trainee.trainee.repository;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		
           Scanner sc = new Scanner(System.in);
           int value=sc.nextInt();
           int number=100;
         if(value % 2 ==0) {
        	 System.out.println("the given value is event numbet" +value);
         }else {
        	 System.out.println("the given value is not even number" + value);
         }
         
	}

}
