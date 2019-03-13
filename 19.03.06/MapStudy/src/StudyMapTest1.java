import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class StudyMapTest1 {

	public static void main(String[] args) {

		HashMap<String, String> userMap = new HashMap();

//		키와 벨류
		userMap.put("myId", "1234");
		userMap.put("asdf", "1111");
		userMap.put("asdf", "1234");
		userMap.put("asdf", "1235");
		

		System.out.println(userMap.get("myId"));
		System.out.println(userMap.get("asdf"));

		List<String> strList = new ArrayList();

		strList.add("asdf");
		strList.add("asdf");

		System.out.println(strList.get(0));
		System.out.println(strList.get(1));

		Scanner scan = new Scanner(System.in);
		String id = "";
		String password = "";

		while (true) {
			System.out.println("id와 password를 입력해주세요");
			System.out.print("id : ");

			id = scan.nextLine().trim();

			System.out.print("password : ");
			password = scan.nextLine().trim();
			System.out.println();

//			사용자 정보에서 id가 존재하지 않으면
			if (!userMap.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다.");
				System.out.println("다시 입력해주세요");

				continue;			// 아래 내용을 실행하지 않고 다시 최상위 객체로 간다.
			} else {
				if (!(userMap.get(id).equals(password))) {
					System.out.println("비밀번호가 일치하지 않습니다.");
					System.out.println("다시 입력해주세요");
				} else {
					System.out.println("id와 비밀번호가 일치합니다.");
					System.out.println("아이디: " + id);
					System.out.println("비번: " + userMap.get(id));
					break;
				}
			}//else 문 종료
		}
		//while 종료
		
		System.out.println("로그인 되셧습니다");
	}
}
