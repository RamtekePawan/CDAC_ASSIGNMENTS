package com.test;

import java.util.Scanner;

import com.domain.Book;
import com.domain.FictionalBook;
import com.domain.NonFictionalBook;
import com.domain.ReferenceBook;

public class Test{
	public static Scanner sc = new Scanner(System.in);
	Book[] arr=null;
	public Test(Book[] arr){
		this.arr = arr ;
	}
	public void acceptData() {
			if(this.arr != null) {
				for (int i = 0; i < this.arr.length; ++i) {
					if(this.arr[i] instanceof ReferenceBook) {
						ReferenceBook rb = (ReferenceBook)arr[i];
						System.out.print("Enter Title :");
						rb.setTitle(sc.nextLine());
						System.out.print("Enter Auther :");
						rb.setAuthor(sc.nextLine());
						System.out.print("Enter Publisher:");
						rb.setPublisher(sc.nextLine());
						System.out.print("Enter Number of Pages :");
						rb.setNumPages(sc.nextInt());
						System.out.print("Enter Edition :");
						rb.setEdition(sc.nextInt());
						rb.calculatePrice();
					}else {
						if(this.arr[i] instanceof FictionalBook) {
							FictionalBook fb = (FictionalBook)arr[i];
							System.out.print("Enter Title :");
							sc.nextLine();
							fb.setTitle(sc.nextLine());
							System.out.print("Enter Auther :");
							fb.setAuthor(sc.nextLine());
							System.out.print("Enter Publisher:");
							fb.setPublisher(sc.nextLine());
							System.out.print("Enter Number of Pages :");
							fb.setNumPages(sc.nextInt());
							System.out.print("Enter Genre :");
							sc.nextLine();
							fb.setGenre(sc.nextLine());
							fb.calculatePrice();
						}else {
							if(this.arr[i] instanceof NonFictionalBook) {
								NonFictionalBook nfb = (NonFictionalBook)arr[i];
								System.out.print("Enter Title :");
								nfb.setTitle(sc.nextLine());
								System.out.print("Enter Auther :");
								nfb.setAuthor(sc.nextLine());
								System.out.print("Enter Publisher:");
								nfb.setPublisher(sc.nextLine());
								System.out.print("Enter Number of Pages :");
								nfb.setNumPages(sc.nextInt());
								System.out.print("Enter Subject :");
								sc.nextLine();
								nfb.setSubject(sc.nextLine());
								nfb.calculatePrice();
							}
						}
					}
					
				}
			}
	}

	public double totalPrice(){
		double sum = 0;
		for (int i = 0; i < this.arr.length; i++) 
			sum += this.arr[i].getPrice();
		return sum;
	}
	
	public void printRecord() {
		for (int i = 0; i < this.arr.length; i++) 
			System.out.println(this.arr[i].toString());
		
	}
	
	public static Book[] getArray() {
		Book[] arr = new Book[3];
		arr[0] = new ReferenceBook();
		arr[1] = new FictionalBook();
		arr[2] = new NonFictionalBook();
		return arr;
	}
}