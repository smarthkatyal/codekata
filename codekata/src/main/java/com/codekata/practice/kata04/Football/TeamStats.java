package com.codekata.practice.kata04.Football;

public class TeamStats {

	private final int goalsScoredFor;
	private final int goalsScoredAgainst;
	private final String teamName;

	public TeamStats(int goalsScoredFor, int goalsScoredAgainst, String teamName) {
		this.goalsScoredFor = goalsScoredFor;
		this.goalsScoredAgainst = goalsScoredAgainst;
		this.teamName = teamName;
	}

	public TeamStats(String line) {
		this.goalsScoredFor = Integer.parseInt(line.substring(40, 47).trim());
		this.goalsScoredAgainst = Integer.parseInt(line.substring(49, 56).trim());
		this.teamName = line.substring(7, 25).trim();
	}

	public Integer differenceOfForAndAgainst() {
		return Integer.valueOf(Math.abs(Integer.sum(goalsScoredFor, -goalsScoredAgainst)));
	}

	public String getTeamName() {
		return teamName;
	}
}
