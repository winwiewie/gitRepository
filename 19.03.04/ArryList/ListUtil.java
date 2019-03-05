import java.util.ArrayList;

public class ListUtil {

	int cnt = 1;
	void arrayListAllPrint(ArrayList list) {
		
		System.out.println("====list 값 출력" + cnt + "=====");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();
		cnt++;
	}
	
void arrayListAllPrint(ArrayList list,String tilte) {
		
		System.out.println("===="+ tilte + "값 출력" + cnt + "=====");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();
		cnt++;
	}
}
