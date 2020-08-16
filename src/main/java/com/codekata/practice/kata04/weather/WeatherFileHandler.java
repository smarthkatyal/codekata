package com.codekata.practice.kata04.weather;

import java.util.ArrayList;
import java.util.List;

import com.codekata.practice.kata04.FileHandler;

public class WeatherFileHandler<T> implements FileHandler<T> {

	private static final String fFilename = "weather.dat";
	private static final String HEADER = "Dy MxT   MnT   AvT   HDDay  AvDP 1HrP TPcpn WxType PDir AvSp Dir MxS SkyC MxR MnR AvSLP";
	private static final String TOTALS = "mo";

	@Override
	public List<T> getFileData() {
		List<T> daysInFile = new ArrayList<>();
		for (String line : readFile(fFilename)) {
			if (shouldSkipLine(line))
				continue;
			daysInFile.add(getDayFromFileLine(line));
		}
		return daysInFile;
	}

	@Override
	public boolean shouldSkipLine(String line) {
		return line.contains(HEADER) || line.trim().startsWith(TOTALS) || line.isBlank();
	}

	private T getDayFromFileLine(String line) {
		int dayNumber = Integer.parseInt(line.substring(0, 4).trim().replaceAll("[^0-9]", ""));
		Double maxTemp = Double.parseDouble(line.substring(4, 8).trim().replaceAll("[^0-9.]", ""));
		Double minTemp = Double.parseDouble(line.substring(8, 14).trim().replaceAll("[^0-9.]", ""));
		return (T) new Day(dayNumber, maxTemp, minTemp);
	}
}
