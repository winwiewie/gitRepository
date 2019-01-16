package tg.exam;

import java.util.Scanner;

public class ExamMainOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1번 문제 정사각형 모양을 출력하기 - 사용자의 숫자 입력에 따라 높이와 넓이가 같은 정사각형을 출력
		Scanner scan = new Scanner(System.in);
		// 정사각형 길이
		int squareLength = 0; 

		System.out.println("정사각형의 길이를 입력해주세요");
		squareLength = scan.nextInt();

		for (int i = 0; i < squareLength; i++) {
			// 직각삼각형
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			// 역직각삼각형
			for (int n = 0; n < (squareLength - i - 1); n++) {
				System.out.print("?");
			}
			// 라인
			System.out.println();
		}

	}

}
