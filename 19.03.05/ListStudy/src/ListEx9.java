import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numList = new ArrayList();
//		int[] numArr = new int[10];

		for (int i = 0; i < 5; i++) {
			numList.add(i);
		}

		Iterator<Integer> it = numList.iterator();
	
		while (it.hasNext()) {
			System.out.println(it.next());

		}
		
		

	}

}