package com.learn.practiceexam;

public class Quetion5 {

	public static void main(String[] args) {
		double cir = Circle.findCircumference(7.5);
		System.out.print("Circumference of circle=" + cir);
	}
	
	public static class Circle {
		public static double findCircumference(double radius) {
			return 2 * Math.PI * radius;
		}
	}

}
