package shj.calendar;


public class Calendar {

	static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	static final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	static final String[] DAY_OF_WEEK = {"SU", "MO", "TU", "WE", "TH", "FR", "SA"};
	
	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ) {
			return true;
		} else {
			return false;
		}
	}
	
	public String getDayOfWeek(String dayOfWeek) {
		
		int index = -1;
		for (int i = 0; i < DAY_OF_WEEK.length; i++) {
			if(dayOfWeek.equals(DAY_OF_WEEK[i])) {
				
				index = i;
			}
		}
		return index+"";
	}
	
	public int getMaxDaysOfMonth(int year, int month) {
		if(isLeapYear(year)) {
			return LEAP_MAX_DAYS[month - 1];
		} else {
			return MAX_DAYS[month - 1];
		}
	}

	public void printCalendar(int year, int month, String weekDay) {
		
		
		System.out.printf("       <<%4d년%3d월>>\n  ", year, month);
		System.out.println("SU  MO TU  WE  TH  FR  SA");
		System.out.println("---------------------------");
		
		int maxDay = getMaxDaysOfMonth(year, month);
		int dayOfWeek = Integer.parseInt(getDayOfWeek(weekDay));
		
		for (int j = 0; j < dayOfWeek; j++) {
			System.out.print("    ");
		}
		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d ",i);
			
			if((i+dayOfWeek)%7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
}
