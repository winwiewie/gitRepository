import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class StudyMapTest2 {

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
		String userIdInput = "";
		String userPwdInput = "";
		
//		userMap.containsKey(id)은 안씀
		if(userMap.get(userIdInput).equals(userPwdInput)) {
			System.out.println("비밀번호가 일치합니다.");
		}
	}
}
