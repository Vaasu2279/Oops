package com.oops;

import java.util.Scanner;

public class Shape_Circle extends Shape {

	@Override
	int shape() {
		Scanner sc = new Scanner(System.in);
		System.out.println("to find the area of circle");
		System.out.println("enter your radius of circle");
		int ra = sc.nextInt();
		ra = 22/7*(ra*ra);
		System.out.println("area of circle is :"+ra);
		return ra;
	}
	
}
