import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//		ArrayList<TeamPerson> teamPersonList = new ArrayList();
//		사용자의 입력을 받는다. 문자열 기록. 다입력햇니 ? 
		

		ArrayList<String> strList= new ArrayList();
		Scanner scan = new Scanner(System.in);
		String like = "";
		
		while (true) {
			System.out.println("사용자가 좋아하는것을 입력해주세요");
			like = scan.nextLine();
			strList.add(like);
			
			System.out.println("전부다 입력햇으면 y 아니면 아무글자나 입력해주세요");
			like = scan.nextLine();
			if (like.equals("y") ) {
				break;
			}
			
		}
		System.out.print("당신이 좋아하는것은 : ");
		for (int i = 0; i < strList.size(); i++) {
			System.out.print(strList.get(i) + " ");
		}
		
	}

}
