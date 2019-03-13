
import java.util.HashMap;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		HashMap<String, String> nickNameMap = new HashMap();

//		키값은 동기의 별명
//		벨류는 동기의 이름
//		3사람 정도 넣어준다
//		사용자 입력을 통해 동기의 별명을 입력하면 
//		별명에 해당하는 동기의 이름을 출력하게 하시오
		
		nickNameMap.put("자바원", "박대승");
		nickNameMap.put("자바투", "조혜선");
		nickNameMap.put("자바쓰리", "장훈일");
		
		String nickName = "";
//		while (true) {
//			System.out.println("별칭을 입력해주세요");
//			System.out.print("별칭 : ");
//			Scanner scan = new Scanner(System.in);
//			nickName = scan.nextLine(); 
//			
//			if (nickNameMap.containsKey(nickName)) {
//				
//				System.out.println("변수에 저장안함 이름 : "+ nickNameMap.get(nickName));
//				
//				nickName = nickNameMap.get(nickName);
//				
//				System.out.println("변수에 저장한후 이름 : "+ nickName);
//				break;
//			}
//			System.out.println("틀렸습니다.");
//			System.out.println("다시 입력해주세요.");
//			System.out.println();
//			
//		}
		
		while (true) {
			System.out.println("별칭을 입력해주세요");
			System.out.print("별칭 : ");
			Scanner scan = new Scanner(System.in);
			nickName = scan.nextLine(); 
			
			if (nickNameMap.get(nickName) != null  ){
				
				System.out.println("변수에 저장안함 이름 : "+ nickNameMap.get(nickName));
				
				nickName = nickNameMap.get(nickName);
				
				System.out.println("변수에 저장한후 이름 : "+ nickName);
				break;
			}
			System.out.println("틀렸습니다.");
			System.out.println("다시 입력해주세요.");
			System.out.println();
			
		}

		
		
	}
}
