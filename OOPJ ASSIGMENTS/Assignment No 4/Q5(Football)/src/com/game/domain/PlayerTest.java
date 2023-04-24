package com.game.domain;

import java.util.Scanner;

import lombok.Setter;

public class PlayerTest{
	Scanner sc  = new Scanner(System.in);
	Player p = new Player();
	Player[] arr;
	public PlayerTest(int size) {
		arr = new Player[ size ];
	}
	
	 public void acceptRec() {
		if(arr != null) {
			int choice;
			for(int index = 0; index < arr.length; ++index) {
				System.out.println("Enter Game  : ");
				System.out.println("1.Cricket");
				System.out.println("2.Football");
				System.out.print("Enter Choice : ");
				choice = sc.nextInt();
				
				if ( choice == 1) {
					arr[index] = new CricketPlayer();
					CricketPlayer cp = (CricketPlayer)arr[index];
					System.out.print("Enter Name of Cricket Player "+(index+1)+": ");
					sc.nextLine();
					cp.setName(sc.nextLine());
					System.out.print("Enter Age of Player "+(index+1)+": ");
					cp.setAge(sc.nextInt());
					System.out.print("Enter Team Name of Player "+(index+1)+": ");
					sc.nextLine();
					cp.setTeam(sc.nextLine());
					System.out.print("Enter Run Scored by the Player "+(index+1)+": ");
					cp.setRunScored(sc.nextInt());
					System.out.print("Enter Wicket taken by the Player "+(index+1)+": ");
					cp.setWicketsTaken(sc.nextInt());				
				}
				else {
					if(choice==2) {
					arr[index] = new FootballPlayer();
						FootballPlayer fp = (FootballPlayer)arr[index];
						System.out.print("Enter Name of Footbal Player "+(index+1)+": ");
						sc.nextLine();
						fp.setName(sc.nextLine());
						System.out.print("Enter Age of Player "+(index+1)+": ");
						fp.setAge(sc.nextInt());
						System.out.print("Enter Team Name of player "+(index+1)+": ");
						sc.nextLine();
						fp.setTeam(sc.nextLine());
						System.out.print("Enter GoalScored by the Player "+(index+1)+": ");
						fp.setGoalScored(sc.nextInt());
						System.out.print("Enter Assist made by the Player "+(index+1)+": ");
						fp.setAssist(sc.nextInt());

					}
				}
				arr[index].play();	// Dynamic method Dispatch
				}
				
			}
		}
	
	public void printRec() {
		int cricketTeamScore = 0;
		int footballTeamScore = 0;
		if(arr != null) {
			System.out.println("==============================================================");
			System.out.println("NAME"+"        "+"AGE"+"   "+"TEAM"+"      "+"SCORE");
			for (int index = 0; index < arr.length;++ index) {
				if( arr[index] instanceof CricketPlayer) 
					cricketTeamScore += arr[index].getScore();
				else 
					footballTeamScore += arr[index].getScore();
				System.out.println(arr[index].toString());
			}
			System.out.println("==============================================================");
			System.out.println("Cricket total Score : "+cricketTeamScore);
			System.out.println("Football total Score : "+footballTeamScore);
		}
	}	 
	public int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Accept Record");
		System.out.println("2.Print Record");
		System.out.print("Enter Choice : ");
		return sc.nextInt();
	}
}