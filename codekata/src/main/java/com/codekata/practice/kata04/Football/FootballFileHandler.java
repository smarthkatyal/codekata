package com.codekata.practice.kata04.Football;

import java.util.ArrayList;
import java.util.List;

import com.codekata.practice.kata04.FileHandler;

public class FootballFileHandler<T> implements FileHandler {

	private static final String fFilename = "kata04/football.dat";
	private static final String HEADER = "Team            P     W    L   D    F      A     Pts";

	@Override
	public List getFileData() {
		List<T> gamesInFile = new ArrayList<>();
		for (String line : readFile(fFilename)) {
			if (shouldSkipLine(line))
				continue;
			gamesInFile.add((T) new TeamStats(line));
		}
		return gamesInFile;
	}

	@Override
	public boolean shouldSkipLine(String line) {
		return line.contains("----------") || line.contains(HEADER) || line.isBlank();
	}

}
