package com.game.domain;

import java.util.Scanner;

public class Program{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total Players : ");
		PlayerTest test = new PlayerTest(sc.nextInt());
		int choice ;
		while((choice = test.menuList()) != 0) {
				try {
					switch(choice) {
						case 1 : test.acceptRec();
							break;
						case 2 :test.printRec();
							break;
						default : System.out.println("Invalid Input!!!");
					}
				} catch (NullPointerException e) {
					e.printStackTrace(System.out);
//					e.getMessage("Team List is Empty!!!");
				}
		}
	}
}
