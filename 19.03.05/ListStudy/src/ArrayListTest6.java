import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//		ArrayList<TeamPerson> teamPersonList = new ArrayList();
		
		ArrayList<GuguDan> gugudanList = new ArrayList();
		GuguDan guguDan = new GuguDan();
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		System.out.println("단을 입력해주세요");
		num = Integer.parseInt(scan.nextLine());
		
		gugudanList = guguDan.setNumDan(num);

		Iterator<GuguDan> it = gugudanList.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
//			it.next().printInfo();

		}
		
//		for (int i = 0; i < 9; i++) {
//			gugudanList.get(i).printInfo();
//		}
		
	}

}
