package shj.calendar;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("---------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		
		int[] endDate = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.print("최대일수를 출력하기 원하는 달을 입력하시오.");
		Scanner sr = new Scanner(System.in);
		int month = sr.nextInt();
		
		System.out.printf("%d는 %d일까지 있습니다.",month,endDate[month-1]);
		sr.close();
	}
}
