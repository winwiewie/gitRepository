import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();

		for (int i = 0; i < 5; i++) {
			list.add(i + 1);
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();

		list.add(0, 0);

		System.out.println("추가후");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();
		System.out.println("=============================================");

//		1번째 문재

		int[] numArr = new int[5];

		for (int i = 0; i < 5; i++) {
			numArr[i] = i + 1;
		}

		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + "\t");
		}
		System.out.println();

		int tmpArr[] = new int[numArr.length + 1];

		tmpArr[0] = 0;

		for (int i = 0; i < numArr.length; i++) {
			tmpArr[i + 1] = numArr[i];
		}

		for (int i = 0; i < tmpArr.length; i++) {
			System.out.print(tmpArr[i] + "\t");
		}

		System.out.println();
		System.out.println("=============================================");

//		2번째 문재

		tmpArr[5] = 0;
		
		for (int i = 0; i < numArr.length; i++) {
			tmpArr[i] = numArr[i];
		}
		
		for (int i = 0; i < tmpArr.length; i++) {

			System.out.print(tmpArr[i] + "\t");

		}
		System.out.println();
	

//	      tmpArr[2] = 0;
		for (int i = 0; i < 2; i++) {

			tmpArr[i] = i+1;


		}
		
		for (int i = 3; i < tmpArr.length; i++) {

			tmpArr[i] = i;

		}
		
		tmpArr[2] = 0;
		
		for (int i = 0; i < tmpArr.length; i++) {

		
			System.out.print(tmpArr[i] + "\t");

		}

	}
}
