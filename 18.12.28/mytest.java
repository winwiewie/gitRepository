import java.util.Scanner;

public class mytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int num;
		
		num = 0;
		
		System.out.print("숫자를 입력하세요 : ");
		num = scan.nextInt();
		
		if( num % 2  == 0) {
			System.out.println(num + "은 짝수 입니다.");
		}else {
			System.out.println(num + "은 홀수입니다.");
		}
	}

}
