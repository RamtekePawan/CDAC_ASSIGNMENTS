package com.Shopping.data;

public class ShoppingCart {
	private Item[] cart ;
	private double totalPrice;
	int index;
	
	public ShoppingCart() {
		cart = new Item[3];
	}
	public ShoppingCart(int cartSize) {
		cart = new Item[ cartSize ];
	}
	
	public double getTotalPrice() {
		for (int i = 0; i < cart.length; i++) {
			this.totalPrice = this.totalPrice + cart[ i ].getTotalPrice();
		}
		return totalPrice;
	}
	public void addItem(Item input ) {
		if(index < cart.length) {
			cart[index]=input;
			index= index + 1;
		}else 
			System.out.println("Cart is FULL!!!!");
	}
	public String toString() {
		return String.format("%-20s%-5d%-10.2f",cart[index-1].getItemName(),cart[index-1].getQty(),cart[index-1].getTotalPrice());
	}
	public void printRecord() {
		System.out.printf("%-20s%-5d%-10.2f",cart[index].getItemName(),cart[index].getQty(),cart[index].getTotalPrice());
	}
}
