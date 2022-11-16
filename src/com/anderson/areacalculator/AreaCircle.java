package com.anderson.areacalculator;

public class AreaCircle {

	static double area;
	double radius;
	static double PI = 3.14;
			
	public static void main(String[] args) {
		
		calcAreaOfACircle(10, PI);
		displayArea();
		

	}
	
	public static void calcAreaOfACircle(double radius, double PI) {
		
		area = PI * (radius * radius);
		
		
	}
	
	public static void displayArea() {
		System.out.println(area);
	}

}
