package string;
import java.util.Scanner;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String name ="김충현";
		String scanName = "";
		boolean b1 = false;
	
		
			
//		while (true) {
//			
//			System.out.println("아무글자나 입력해주세요 (hint:개발자 이름)");
//			System.out.print("enter:)");
//			scanName = scan.nextLine();
//			
//			if (scanName.equals(name)){
//				System.out.println();
//				System.out.println("게임을 종료합니디");
//				
//				break;
//				
//			}else {
//				System.out.println("틀렸습니다. 다시 입력해주세요");
//				System.out.println();
//			}
//		}
		
		while (true) {
			
			System.out.println("아무글자나 입력해주세요 (hint:개발자 이름)");
			System.out.print("enter:)");
			scanName = scan.nextLine();

			b1 = name.equals(scanName);
			
			if (true == b1){
				System.out.println();
				System.out.println("게임을 종료합니디");
				
				break;

			}else {
				System.out.println("틀렸습니다. 다시 입력해주세요");
				System.out.println();
			}
		}		

		
		
	}

}
