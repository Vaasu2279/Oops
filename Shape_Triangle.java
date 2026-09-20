package com.oops;

import java.util.Scanner;

public class Shape_Triangle extends Shape {

	@Override
	int shape() {
		Scanner sc = new Scanner(System.in);
		System.out.println("to find the area of triangle");
		System.out.println("enter your base ");
		int base = sc.nextInt();
		System.out.println("enter your height");
		int height = sc.nextInt();
		int area = (int) (0.5*(base*height));
		System.out.println("area of triangle is :"+area);
		return area;
	}
}
