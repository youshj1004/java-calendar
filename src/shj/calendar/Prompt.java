package shj.calendar;

import java.util.Scanner;

public class Prompt {

	private final static String YEAR = "YEAR> ";
	private final static String MONTH = "MONTH> ";
	private final static String WEEKDAY = "WEEKDAY > ";

	public static void runPrompt() {
		Calendar cal = new Calendar();
		Scanner sr = new Scanner(System.in);
		
		int month = 1;
		int year = 2018;
		String weekday = "";
		
		while (true) {
			System.out.println("년도를 입력하세요.(exit:-1)");
			System.out.print(YEAR);
			year = sr.nextInt();
			if(year == -1) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			System.out.println("달을 입력하세요.");
			System.out.print(MONTH);
			month = sr.nextInt();
			if (month > 12 || month < 1)  {
				System.out.printf("%d월은 존재하지 않습니다.", month);
			}
			System.out.println("첫번째 요일을 입력하세요(SU,MO,TU,WE,TH,FR,SA)");
			System.out.print(WEEKDAY);
			weekday = sr.next().toUpperCase();

			cal.printCalendar(year, month, weekday);
			
		}
	}

	public static void main(String[] args) {
		// 셀 실행
		runPrompt();

	}

}
