package com.codekata.practice.kata04.weather;

import java.util.Comparator;

import com.codekata.practice.kata04.FileHandler;

public class WeatherData {

	private final FileHandler<Day> fFileHandler;

	public WeatherData() {
		this(new WeatherFileHandler());
	}

	private WeatherData(FileHandler fileHandler) {
		fFileHandler = fileHandler;
	}

	public int getSmallestTemperatureSpread() {

		return fFileHandler.getFileData()
				.stream()
				.min(Comparator.comparingDouble(Day::getTempSplit))
				.map(Day::getDayNumber)
				.orElseThrow();
	}
}
