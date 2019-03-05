import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListUtil lu = new ListUtil();
		ArrayList list = new ArrayList();

		list.add(new Integer(1));
		list.add(new Integer(6));
		list.add(new Integer(3));
		list.add(new Integer(2));
		list.add(new Integer(4));
		list.add(new Integer(5));

		// 1
//      lu.arrayListAllPrint(list);

		ArrayList list2 = new ArrayList(list.subList(1, 4));
		// 2
//      lu.arrayListAllPrint(list2);

		Collections.sort(list);
		Collections.sort(list2);

		// 3
//      lu.arrayListAllPrint(list);
		// 4
//      lu.arrayListAllPrint(list2);

		list2.add("B");
		list2.add("C");
		list2.add(3, "A");

		// 5
//      lu.arrayListAllPrint(list2);

//      list2.set(3, "AA");
		// 6
		lu.arrayListAllPrint(list);
		lu.arrayListAllPrint(list2);

//      list2.remove(2);
//
//		for (int i = 0; i < list.size()-3; i++) {
//
//			list2.remove(0);
//		}
		
		System.out.println(list2);
		
		list2.remove(list2.indexOf(2));
		list2.remove(list2.indexOf(3));
		list2.remove(list2.indexOf(6));

		
//		강인씨
//		   for (int i = 0; i < list.size(); i++) {
//			      for (int j = 0; j < list2.size(); j++) {
//			         if(list.get(i)==list2.get(j)) {
//			            list2.remove(j);
//			         }
//			}
//		}
//
//		lu.arrayListAllPrint(list);
//		lu.arrayListAllPrint(list2);
		
		
//		System.out.println("=====================제거후");
//		lu.arrayListAllPrint(list);
		lu.arrayListAllPrint(list2);
//		System.out.println(list2.size());

	}

}