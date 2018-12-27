
public class GugudanTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		강사님거	
		
//		for(int i = 1; i <= 9; i++) {
//		
//		for(int n = 2; n <= 9; n++) {
//			System.out.print(n + " * " + i + " = " + (i * n) + "\t");
//		}
//		
//		System.out.println();
//	}

//		결과값		
		
//		2 * 1 = 2    3 * 1 = 3		4 * 1 = 4
//		2 * 2 = 4 	 3 * 2 = 6		4 * 2 = 8
//		2 * 3 = 6	 3 * 3 = 9		4 * 3 = 12
		
		
		

//		for (int i = 2; i <= 9; i++) {
//			System.out.println(i + "단");
//
//			for (int n = 1; n <= 9; n++) {
//				System.out.println(i + " * " + n + " = " + (i * n));
//			}
//
//			System.out.println();
//		}
		
		System.out.println("2 * 1 = 2    2 * 2 = 4");

		for (int i = 2; i <= 9; i++) { // 첫번재를 실행한다.

			for (int n = 1; n <= 9; n++) {
				System.out.print(i + " * " + n + " = " + (i * n) + "\t");
			}
			System.out.println();
		}
	}

}
