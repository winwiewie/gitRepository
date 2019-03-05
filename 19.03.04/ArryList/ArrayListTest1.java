import java.util.ArrayList;

public class ArrayListTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ArrayList list = new ArrayList();
		Team2 t2 = new Team2();
		
		String Team1 = "";
		String Team1name = "";
		String Team1age = "";
		Team1 = "팀 번호: 2";
		Team1name = "팀원의 이름: 장훈일";
		Team1age = "팀원의 나이: 39";
		
		list.add("팀 번호:1");
		list.add("팀원의 이름: 조혜선");
		list.add("팀원의 나이: 23 \n");
		list.add(Team1 +"\n" +Team1name + "\n" + Team1age);

	

//		System.out.println(list.get(0));
//		System.out.println(list.get());
		
		System.out.println("=============================");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
