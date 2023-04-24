package org.Assignment.DayWeek;



public enum DayOfWeek {
	SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

	private int dayNumber;

	private DayOfWeek(int dayNumber) {

		this.dayNumber = dayNumber;
	}

	public void setNumber(int dayNumber) {
		this.dayNumber = dayNumber;
	}

	public static int getDayNumber( DayOfWeek day ) {
		
		return day.dayNumber;
	}

	public static void printDay(DayOfWeek day) {
		System.out.println("Day : "+day);		
	}

    public static DayOfWeek getNextDay(DayOfWeek day) {
    	return  DayOfWeek.values()[ day.ordinal()+1 ];
    	
}

	public static DayOfWeek[] getWeekendDays() {
		DayOfWeek[] arr = {DayOfWeek.SATURDAY,DayOfWeek.SUNDAY};
		return arr;
	}
}