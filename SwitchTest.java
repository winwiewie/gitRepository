import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		
		int spring = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1~12달 중 숫자를 입력하세요");
		spring = scan.nextInt();
		System.out.println("");
		
		switch (spring) {
		case 12: case 1: case 2:  
			System.out.println(spring +"월은 겨울입니다.");
			break;
			
		case 3: case 4: case 5:  
			System.out.println(spring +"월은 봄입니다.");
			break;
			
		case 6: case 7: case 8:  
			System.out.println(spring +"월은 여름입니다.");
			break;
			
		case 9: case 10: case 11:  
			System.out.println(spring +"월은 가을입니다.");
			break;
			
		default:
			System.out.println(spring +"은 잘못입력하였습니다.");
			break;
		}
	}
}
