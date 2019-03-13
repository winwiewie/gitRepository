package string1;

import java.util.Scanner;

public class ExceptionEx1 {

	public static void main(String[] args) {
	
		int num = 0;
		int module = 10;
		int resultNum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		num = scan.nextInt();
		
		scan.nextLine();
		
		System.out.println("나눌값을 입력해주세요");
		module = Integer.parseInt(scan.nextLine());
		try {
			resultNum = num / module;
		} catch(ArithmeticException e) {
			System.out.println("논리적인 오류가 발생해서 예외 처리함");
		}
		
		System.out.println("결과값 : " +resultNum);
	}
}
