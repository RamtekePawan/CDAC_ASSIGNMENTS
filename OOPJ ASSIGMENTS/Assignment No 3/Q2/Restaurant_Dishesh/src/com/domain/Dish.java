package com.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @Getter @Setter
public class Dish{
	String Dishname;
	float price;
	@Override
	public String toString() {
		return String.format("%-19s $%-5.2f",this.getDishname(),this.getPrice());
	}
}