package com.test;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.domain.Dish;

public class DishTest{	
	Dish[] arr;  // Array of References 
	static int index;
	public DishTest() {
		this.arr = new Dish[10];
	}
	
	//Setting name and price
	static Scanner sc = new Scanner( System.in);
	
	
	public void addDish(Dish dish) throws NullPointerException{
		for ( int i = 0; i < arr.length;++i) {
			if(arr[i] == null) {
				arr[i] = dish;
				break;
			}
		}
	}
	public void removeDish(String rmDish) {
		for ( int i = 0; i < arr.length;++i) {
				if(arr[i].getDishname().equalsIgnoreCase(rmDish))
					arr[i] = null;
		}
	}
	public void modifyPrice(String modify) {
		for ( int i = 0; i < arr.length;++i) {
				if(arr[i].getDishname().equalsIgnoreCase(modify)) {
					System.out.println("Enter New Price : ");
					arr[i].setPrice(sc.nextFloat());
				}
		}
	}
	public void viewMenu() throws NullPointerException{
		System.out.println("================================================");
		System.out.println("NAME                Price($)");
		for ( int i = 0,j=9; i < (arr.length-j);++i,--j) 
				System.out.println(arr[i].toString());		
		System.out.println("================================================");
	}
	public static int menuList() throws InputMismatchException {
		System.err.println("0.Exit");
		System.err.println("1.Add Dish");
		System.err.println("2.Remove Dish");
		System.err.println("3.Modify Price of Dish");
		System.err.println("4.View Menu");
		System.err.println("Enter Chioice : ");
		return sc.nextInt();
	}
	public static Dish createDish() {
		Dish dish = new Dish();
		System.out.print("Enter Name of the Dish : ");
		sc.nextLine();
		dish.setDishname(sc.nextLine());
		System.out.print("Enter Price of the Dish : ");
		dish.setPrice(sc.nextFloat());
		return dish;

	}	
}