import java.util.Scanner;

public class MaxFindTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		MaxFind max = new MaxFind();
		
		int num1;
		int num2;
		int result;

		
		System.out.println("숫자를 입력해주세요");
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		
		result = max.max(num1, num2);
		
		System.out.println(result +"의 값이 큽니다.");

	}

}
