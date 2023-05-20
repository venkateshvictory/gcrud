package com.trainee.trainee.repository;

import org.hibernate.internal.build.AllowSysOut;

public class Duplicate {

	public static void main(String[] args) {
//	   String name = "venkatesh";
//	   char[] ch=name.toCharArray();
//	   for(int i=0; i<ch.length; i++) {
//		   for(int j=i; j<ch.length; j++) {
//			  if(ch[i] == ch[j]) {
//				  System.out.println(ch[j]);
//			  }
//			  break;
//		   }
//	   }
		
	     String str = "beautiful beach";
	      char[] carray = str.toCharArray();
	      System.out.println("The string is:" + str);
	      System.out.print("Duplicate Characters in above string are: ");
	      for (int i = 0; i < str.length(); i++) {
	         for (int j = i +1; j < str.length(); j++) {
	            if (carray[i] == carray[j]) {
	               System.out.print(carray[j] + " ");
	               break;
	            }
	         }
	      }
	   }
	
	}


