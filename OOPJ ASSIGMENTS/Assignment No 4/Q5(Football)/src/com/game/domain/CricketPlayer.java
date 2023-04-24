package com.game.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter @NoArgsConstructor
public class CricketPlayer extends Player{
	int runScored;
	int wicketsTaken;
	@Override
	public void play() {
		this.setScore(this.runScored + (this.wicketsTaken * 10));
	}
	@Override
	public String toString() {
		return String.format("%-12s%-6d%-10s%-4d", this.getName(),this.getAge(),this.getTeam(),this.getScore() );
	}
}
