import java.util.Scanner;

public class MadeTest {

	public static void main(String[] args) {

		double num1 = 0;
		double num2 = 0;
		double sum = 0;

		int loop = 0;
		
		loop = 0;
		sum = 0;

		Scanner scan = new Scanner(System.in);

		while (loop < 3) {

			System.out.print("첫번째 숫자를 입력하시오 : ");
			num1 = scan.nextDouble();
			System.out.print("두번째 숫자를 입력하시오 : ");
			num2 = scan.nextDouble();
			System.out.println();
			
			sum = num1 + num2;
			System.out.println(num1 + "와 " + num2 + "의 합은 " + sum + " 입니다.");
			System.out.println();
			
			loop++;
		}
		
		System.out.println("프로그램 종료");
	}
}
