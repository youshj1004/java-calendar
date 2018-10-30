package shj.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		
		int first, second;
		System.out.print("두 수를 입력하세요");
		Scanner sr = new Scanner(System.in);  // 키보드를 사용하여 데이터 입력받음
		String s1 = sr.next();
		String s2 = sr.next();
		
		first = Integer.parseInt(s1);
		second = Integer.parseInt(s2);
		
		System.out.printf("두 수의 합은 %d입니다.", first + second);
		sr.close();
	}
}
