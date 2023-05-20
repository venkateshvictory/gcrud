package com.trainee.trainee.repository;

import java.util.Scanner;

public class Test3 {

	String fistName;

	String lastName;

	public static String getUserName(String firstName, String lastName)

	{

		if (firstName == null)

			return capitalisefirstletter(lastName);

		else if (lastName == null)

			return capitalisefirstletter(firstName);

		return capitalisefirstletter(lastName) + " ," + capitalisefirstletter(firstName);

	}

	public static String capitalisefirstletter(String s)

	{

		if (s == null || s.length() < 1)

		{

			return "s";

		}

		char[] chars = s.toCharArray();

		chars[0] = Character.toUpperCase(chars[0]);

		return String.valueOf(chars);
           
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String str=sc.next();
		System.out.println("enter second name");
		Scanner sc1 = new Scanner(System.in);
		String str1=sc1.next();
		
	String	output=getUserName(str, str1);
	System.out.println(output);
		
	}

}
