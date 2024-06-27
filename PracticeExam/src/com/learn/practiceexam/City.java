package com.learn.practiceexam;

import java.util.List;

public class City {

	private static final int getPopulation = 0;

	public City(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		var cities = List.of(new City("Berlin", 3_520_000),
				new City("Humburg", 1_790_000),
				new City("Munich", 1_450_000),
				new City("Cologne", 1_060_000),
				new City("Frankfurt", 730_000));
		
		cities.stream()
		.filter(city ->city.getPopulation< 1_000_000)
		.findFirst()
		.orElse(new City("Not Found", 0));
	}

}
