package com.codekata.practice.kata04;

import java.io.IOException;

import com.codekata.practice.kata04.Football.FootballData;
import com.codekata.practice.kata04.weather.WeatherData;

public class Kata04Main {

	public static void main(String[] args) throws IOException {
		System.out.println("Smallest Temp Split: " + new WeatherData().getSmallestTemperatureSpread());
		System.out.println("Smallest Goal Split: " + new FootballData().getSmallestDifferenceInForAndAgainstGoals());
	}


}
