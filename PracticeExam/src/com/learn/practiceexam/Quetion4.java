package com.learn.practiceexam;

public class Quetion4 {

	public enum Planet{
		MURKURY(0.39), VENUS(), EARTH();
		
		private double distanceFromSunAU = 1.0;
		
		private Planet(double distance) {
			distanceFromSunAU = distance;
		}
		
		private Planet() {
			distanceFromSunAU = 5.0;
		}
		
		public double getDistance() {
			return distanceFromSunAU;
		}
		
	}
	public static void main(String[] args) {
		for(Planet p : Planet.values())
			System.out.println(p.getDistance());

	}

}
