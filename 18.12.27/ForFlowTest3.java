import java.util.Scanner;

public class ForFlowTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("숫자를 입력하시오");
			num = scan.nextInt();

			if (num % 2 == 0) { 		//num 를 2로 나누고 나머지가 0 이고 트루일때 if문 실행
				System.out.println(num + "은 짝수입니다");
				System.out.println("");

			} else if (num % 2 == 1) {	//num 를 2로 나누고 나머지가 1이고 트루이면 else if문 실행
				System.out.println(num + "은 홀수입니다");
				System.out.println("");
			} else {					// 값이 다르면 else 를 실행
				System.out.println("잘못입력하엿습니다.");
				System.out.println("");
			}
		}
//		for (int i = 0; i < 3; i++) {
//			
//			System.out.println(num + "은 짝수 입니다");
//			num = scan.nextInt();
//		}
		

		
	}
}
