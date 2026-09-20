package com.oops;

import java.util.Scanner;

public class Shape_rectangle extends Shape {

	@Override
	int shape() {
		Scanner sc =new Scanner(System.in);
		System.out.println("to find the area of rectangle");
		System.out.println("enter your length");
		int len = sc.nextInt();
		System.out.println("enter your bredth");
		int bre = sc.nextInt();
		int area = len*bre;
		System.out.println("area of rectangle is :"+area);
		return area;
	}
	
}
