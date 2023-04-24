package Org.main;

import java.util.Scanner;

enum Dish{
	EXIT, DISH1,DISH2,DISH3,DISH4;
	
//	static float[] price = {0,10.00f,15.00f,8,12}; 
}
//class Management{
//	int choice;
//	int quantity;
//	int total;
//	
//	public String toString() {
//		return String.format("Total cost : "+Dish.values()[choice]+" $"+ (Dish.price[choice]*quantity );
//	}
//}

public class Program {
	 
//	Management[]	
	public static Dish menuList(){
		Scanner sc = new Scanner(System.in);
		Dish arr = Dish.values();
		for (int i = 0;i<arr.length;i++) {
			if (i==0) {
				System.out.printf("%d.%-5s \n",i,arr[i]);
				continue;
			}
			System.out.printf("%d.%-5s -$%-5.2f\n",(i),arr[i],Dish.price[i]);
		}
		System.out.println("Please enter the dish number you wish to order : ");
		int choice = sc.nextInt();
		return Dish.values()[ choice ];
	}
	
	private static void printBill(int choice,int quantity) {
				 
		 }
		


	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		System.out.println(Dish.values());
//	Dish choice ;
//	while((choice = Program.menuList())!= Dish.EXIT ) {
//		System.out.print("Please enter the quantity you wish to order : ");
//		int quantity = sc.nextInt();
//		float total = 0;
//		switch (choice) {
//		case EXIT: break;
//		case DISH1: 
//			total = Dish.price[Dish.DISH1.ordinal()]* quantity;
//			Program.printBill(Dish.DISH1.ordinal(),quantity);
//			break;
//		case DISH2: 
//			total = Dish.price[Dish.DISH1.ordinal()] * quantity;
//			Program.printBill(Dish.DISH1.ordinal(),quantity);
//			break;
//		case DISH3: 
//			total = Dish.price[Dish.DISH1.ordinal()] * quantity;
//			Program.printBill(Dish.DISH1.ordinal(),quantity);
//			break;
//		case DISH4: 
//			total = Dish.price[Dish.DISH1.ordinal()] * quantity;
//			Program.printBill(Dish.DISH1.ordinal(),quantity);
//			break;
		}	  

		
		
	
	
	}

