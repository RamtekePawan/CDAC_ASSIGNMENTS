package org.Assginment.main;

import org.Assignment.DayWeek.*;
 class Program {
	public static void main(String[] args) {
		DayOfWeek day = DayOfWeek.MONDAY;
//		DayOfWeek [] day = DayOfWeek.values();
	
		DayOfWeek.printDay(day);
		System.out.println("Next Day : "+DayOfWeek.getNextDay(day));
		
		System.out.println("Number Of The Day : "+DayOfWeek.getDayNumber(day));
		
		DayOfWeek[] weekends = DayOfWeek.getWeekendDays() ;
		System.out.print("Week Days : ");
		for (DayOfWeek ele : weekends)
		System.err.printf(ele.toString()+ "  ");
	}
	
	
	
	
}