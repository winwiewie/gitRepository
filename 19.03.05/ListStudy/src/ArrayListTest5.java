import java.util.ArrayList;

public class ArrayListTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> intList= new ArrayList();
//		ArrayList<TeamPerson> teamPersonList = new ArrayList();

		int twoDan = 2;
		int twoDanSum = 0;
		
		for (int i = 0; i < 9; i++) {
			twoDanSum = twoDan * (i+1);
			intList.add(twoDanSum);
		}
		
//		이렇게 짜면 안됨
//		intList.add(eDan * 1);
//		intList.add(eDan * 2);
//		intList.add(eDan * 3);
//		intList.add(eDan * 4);
//		intList.add(eDan * 5);
//		intList.add(eDan * 6);
//		intList.add(eDan * 7);
//		intList.add(eDan * 8);
//		intList.add(eDan * 9);

		
		
//		용량은 많아지고 속도는 느려지지만 팀원이 이해하기 쉬움
		for (int i = 0; i < intList.size(); i++) {
			int danValue = i+1;
			String print = "";
			twoDanSum = intList.get(i);
			print = twoDan + " * "+ danValue  + " = " + twoDanSum;
					
			System.out.println(print);
		}
		System.out.println();
		
//		속도는 빨라지지만 팀원이 이해하기 어려움
		for (int i = 0; i < intList.size(); i++) {

		System.out.println( twoDan + " * "+ (i+1) + " = " + intList.get(i));

		}
		
		
		System.out.println(intList);
	}

}
