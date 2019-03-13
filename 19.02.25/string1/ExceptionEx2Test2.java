package string1;

import java.util.Scanner;

public class ExceptionEx2Test2 {
	public static void main(String[] args) {

		System.out.println("어서오세요");
		System.out.println("Welcome to");
		System.out.println("이랏샤이마세");

		System.out.println("무한 숫자 타자 연습");

		Scanner scan = new Scanner(System.in);
		int inputNum = 0;

		while (true) {
			try {
				System.out.println("프로그램을 종료하실려면 -999를 입력해 주세요");
				if (inputNum == -999) {
					break;
				}
				System.out.println("숫자를 입력하세요");
				inputNum = scan.nextInt();
			} catch (Exception e) {
				System.out.println("ex:) 문제가 발생했습니다.");
				scan.nextLine();
			}
		}

		System.out.println("프로그램을 종료합니다");

	}
}