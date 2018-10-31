package shj.calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal>";

	public void runPrompt() {
		Calendar cal = new Calendar();
		Scanner sr = new Scanner(System.in);

		while (true) {
			System.out.println("월을 입력하세요.(-1을 입력하면 종료됩니다.)");
			System.out.print(PROMPT);
			int month = sr.nextInt();
			if (month == -1) {
				break;
			}
			if (month > 12) {
				System.out.printf("%d월은 존재하지 않습니다.", month);
				continue;
			}
			cal.printCalendar(2018, month);
			
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

	public static void main(String[] args) {
		// 셀 실행
		Prompt p = new Prompt();
		p.runPrompt();

	}

}
