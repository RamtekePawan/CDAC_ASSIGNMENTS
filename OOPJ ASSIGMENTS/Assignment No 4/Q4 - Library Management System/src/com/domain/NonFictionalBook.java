package com.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class NonFictionalBook extends Book{
	String subject ;
	@Override
	public void calculatePrice() {
		if(this.subject.equalsIgnoreCase("History"))
			this.price = ((this.numPages * 2.0d)-((this.numPages*2.0d)*0.15d));
		else
			this.price = this.numPages * 2.0d;
	}
	@Override
	public String toString() {
		return String.format("%-15s%-15s%-15s$%-6.2f",this.getTitle(),this.getAuthor(),this.getPublisher(),this.getPrice());
	}

}
