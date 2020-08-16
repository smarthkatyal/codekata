package com.codekata.practice.kata04.weather;

public class Day {

	private final Double maxTemp;
	private final Double minTemp;
	private final int dayNumber;

	public Day(int dayNumber, Double maxTemp, Double minTemp) {
		this.maxTemp = maxTemp;
		this.minTemp = minTemp;
		this.dayNumber = dayNumber;
	}

	public Double getTempSplit() {
		return Double.sum(maxTemp, -minTemp);
	}

	public Integer getDayNumber() {
		return dayNumber;
	}
}
