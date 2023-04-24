package com.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.test.DishTest;

public class Program {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		DishTest test = new DishTest();
		int choice;
		while((choice = DishTest.menuList()) != 0) {
			try {
				try {
					switch (choice) {
					case 1:	
						test.addDish(DishTest.createDish());				
						break;
					case 2:	
						System.out.println("Enter Name : ");
						test.removeDish(sc.nextLine());				
						break;
					case 3:	
						System.out.print("Enter Name of Dish To Modify :");
						test.modifyPrice(sc.nextLine());				
						break;
					case 4:	
						test.viewMenu();				
						break;
					default:
						break;
					}
				} catch (Exception e) {
					e.getMessage();
//					e.printStackTrace();
				}
			} catch (NullPointerException |InputMismatchException e) {
				e.getMessage();
			}
		}
	}
}
