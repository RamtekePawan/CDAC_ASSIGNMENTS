package com.Shopping.data;

public class ShoppingCartTest {
	
	public static void main(String[] args) {
		
		Item pen1 = new Item("Pen1",10,2);
		Item pen2 = new Item("Pen2",10,3);
		Item pen3 = new Item("Pen3",20,2);
		
		
		ShoppingCart pawan = new ShoppingCart();
		pawan.addItem(pen1);
		pawan.addItem(pen2);
		pawan.addItem(pen3);
		
		pawan.toString();
		pawan.printRecord();
		
		System.out.println("===============================================================");
}
}
