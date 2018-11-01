package shj.calendar;

import java.util.Scanner;

public class Prompt {

	private final static String YEAR = "YEAR> ";
	private final static String MONTH = "MONTH> ";

	public static void runPrompt() {
		Calendar cal = new Calendar();
		Scanner sr = new Scanner(System.in);

		while (true) {
			System.out.println("년도를 입력하세요.");
			System.out.print(YEAR);
			int year = sr.nextInt();
			System.out.println("월을 입력하세요.(-1을 입력하면 종료됩니다.)");
			System.out.print(MONTH);
			int month = sr.nextInt();
			if (month == -1) {
				break;
			}
			if (month > 12) {
				System.out.printf("%d월은 존재하지 않습니다.", month);
				continue;
			}
			cal.printCalendar(year, month);
			
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

	public static void main(String[] args) {
		// 셀 실행
		runPrompt();

	}

}
