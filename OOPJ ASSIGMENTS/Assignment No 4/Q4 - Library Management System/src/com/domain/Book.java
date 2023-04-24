package com.domain;

import java.util.Arrays;
import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor@AllArgsConstructor @Setter@Getter
public class Book {
		String title;
		String author;
		String publisher;
		double price;
		int numPages;
		public void calculatePrice() { }
		@Override
		public String toString() {
			return String.format("%-15s%-15s%-15s$%-6.2f",this.getTitle(),this.getAuthor(),this.getPublisher(),this.getPrice());
		}
}







