package com.learn.practiceexam;

import java.math.BigDecimal;
import java.util.function.Function;

public class Planet {
	
	private BigDecimal milesFromSun;
	public Planet(String milesFromSun){
		this.milesFromSun = new BigDecimal(milesFromSun);
	}
	public BigDecimal getMilesFromSun(){
		return milesFromSun;
	}
	public static BigDecimal milesToKilometers(BigDecimal miles){
		BigDecimal scale = new BigDecimal("1.60934");
		return miles.multiply(scale);
	}
	
	public static void main(String[] args) {
		Planet earth = new Planet("93000000");
		Function<BigDecimal, BigDecimal> lambda = Planet::milesToKilometers;

	}

}
