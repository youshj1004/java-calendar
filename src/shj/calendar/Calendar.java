package shj.calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public void printSampleCalendar() {
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("---------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {

		String PROMPT = "cal> ";
		Calendar cal = new Calendar();
		Scanner sr = new Scanner(System.in);

		while (true) {
			System.out.println("월을 입력하세요.(-1을 입력하면 종료됩니다.)");
			System.out.print(PROMPT);
			int month = sr.nextInt();
			if (month == -1) {
				break;
			}
			if(month > 12) {
				System.out.printf("%d월은 존재하지 않습니다.",month);
				continue;
			}
			System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(month));

		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}
