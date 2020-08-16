package com.codekata.practice.kata04;

import com.codekata.practice.kata04.Football.FootballData;
import com.codekata.practice.kata04.weather.WeatherData;

public class Kata04Main {

	public static void main(String[] args) {
		System.out.println("Smallest Temp Split: " + new WeatherData().getSmallestTemperatureSpread());
		System.out.println("Smallest Goal Split: " + new FootballData().getSmallestDifferenceInForAndAgainstGoals());
	}


}
