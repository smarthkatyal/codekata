package com.codekata.practice.kata04.Football;

import java.util.Comparator;

import com.codekata.practice.kata04.FileHandler;

public class FootballData {
	private final FileHandler<TeamStats> fFileHandler;

	public FootballData() {
		this(new FootballFileHandler());
	}

	private FootballData(FileHandler fileHandler) {
		fFileHandler = fileHandler;
	}

	public String getSmallestDifferenceInForAndAgainstGoals() {
		return fFileHandler.getFileData().stream()
				.min(Comparator.comparingInt(TeamStats::differenceOfForAndAgainst))
				.map(TeamStats::getTeamName)
				.orElseThrow();
	}
}
