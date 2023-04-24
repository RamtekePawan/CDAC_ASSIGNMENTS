package com.game.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter @NoArgsConstructor
public class FootballPlayer extends Player{
	int goalScored;
	int assist;
	@Override
	public void play() {
		this.setScore((this.assist * 5)+this.goalScored);
	}
	@Override
	public String toString() {
		return String.format("%-12s%-6d%-10s%-4d", this.getName(),this.getAge(),this.getTeam(),this.getScore() );
	}
}
