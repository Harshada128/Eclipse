package com.learn.practiceexam;

public class Square {
	
	private double length;
	public Square(double length) {
		this.length = length;
	}
        public double findSurfaceArea(){
                return length*length;
        }
        
        public class Cube extends Square {
        	public Cube(double length) {
        		super(length);
        	}
        	public double findSurfaceArea() {
        		return super.findSurfaceArea() * 6;
        	}
        }

	public static void main(String[] args) {
		Square shape = new Cube(1);
		System.out.println(shape.findSurfaceArea());
	}

}
