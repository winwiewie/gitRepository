import java.util.Scanner;

public class TriangleOperExtest {

	public static void main(String[] args) {
		
//		삼항연산자
//		표현식
//		(조건식) ?  식1  :   식2
//				  true :  false			
//		ex : 변수 = (조건식) ? 식1 : 식2; 
//  	? -> 맞으면 		
		
		int num;
		num = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		num = scan.nextInt();
		
		int absNum = (num >= 0) ?  num : -num;	// -> absX = x;
		
		System.out.println("num = " + num + "일때 , x의 절대값은 " + absNum);
		
	}
}
