import java.util.Scanner;

public class OperEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		비교 연산자
//		>, <, <=, >=, ==, !=
		int num = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		num = scan.nextInt();
				
		System.out.println("num > 1 결과는 : " + (num > 1));
//		크다, 작다, 초과, 미만
		
		System.out.println(num <= 3);
//		크거나 같다, 작거나 같다, 이상, 이하
		
		System.out.println(num == 2);
//		2 == 2 같다 일때 true
		
		System.out.println(num != 0);
//		!= 다르다
		
	}

}
