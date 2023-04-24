package com.Shopping.data;

public class Item {
	String itemName;
	double totalPrice;
	int qty;
	
	public Item(String itemName, double unitPrice, int qty) {
		this.itemName = itemName;
		this.qty = qty;
		this.totalPrice =qty * unitPrice;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
}
