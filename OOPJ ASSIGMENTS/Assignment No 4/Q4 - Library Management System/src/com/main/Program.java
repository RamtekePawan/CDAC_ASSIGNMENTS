package com.main;

import com.test.Test;

public class Program{
	public static void main(String[] args) {
		Test test = new Test(Test.getArray());
		test.acceptData();
		test.printRecord();
		System.out.println("Total Price $" + test.totalPrice());
		
	}
}