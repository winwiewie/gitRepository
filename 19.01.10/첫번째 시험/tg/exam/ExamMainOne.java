package tg.exam;

import java.util.Scanner;

public class ExamMainOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1번 문제 정사각형 모양을 출력하기 - 사용자의 숫자 입력에 따라 높이와 넓이가 같은 정사각형을 출력
		
		
		Scanner scan = new Scanner(System.in); 		// 사용자의 숫자를 입력 받기 위해서 스캔너 를 만듬.  
		int num = 0;								// 사용자의 숫자를 저장하기 위해서 선언
		
		System.out.println("정사각형 길이를 입력해주세요");		
		num = scan.nextInt();						// 사용자의 숫자를 입력한후 num에 저장한다.
		
		//사각형 출력하는 공식
		for (int i = 0; i < num; i++) {    // i랑 num을 비교한다  num이 i보다 크면 종료
			for (int a = 0; a <= i; a++) {	// a의 값을 0부터 증가시키며 a랑 i의 값이 같거나 크면for문 종료 
				System.out.print("*");
			}
			for (int n = num-1; n > i; n--) { // num-1 값과  n의 값이같으면 for문 을 종료
				System.out.print("?");
				}
			System.out.println();			//위에 2개의 for문을 실행하면 줄바꿈 실행
		}
	}
}
