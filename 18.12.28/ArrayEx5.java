public class ArrayEx5 {

	public static void main(String[] args) {

		int[] numArr = new int[5];
		int[] backUpNumArr = new int[5];
		
		numArr[0] = 10;
		backUpNumArr[0] = numArr[0];
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.println("원본데이터 : " + numArr[i]);
		}

		System.out.println();

		for (int i = 0; i < backUpNumArr.length; i++) {

			System.out.println("백업데이터 : " + backUpNumArr[i]);
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~");
		
		numArr[0] = 30;
		backUpNumArr[3] = 40;
		for (int i = 0; i < numArr.length; i++) {
			System.out.println("원본데이터 : " + numArr[i]);
		}

		System.out.println();

		for (int i = 0; i < backUpNumArr.length; i++) {

			System.out.println("백업데이터 : " + backUpNumArr[i]);
		}


	}
}
