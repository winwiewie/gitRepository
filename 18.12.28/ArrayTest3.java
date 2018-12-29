
public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numArr = new int[5];
		int[] backUpArr = new int[10];
		
		
		for (int i = 0; i < numArr.length; i++) {
			
			numArr[i] = (int)(Math.random() * 5) + 1;		
			
		}
		
		backUpArr[0] = numArr[0];
		backUpArr[1] = numArr[1];
		backUpArr[2] = numArr[2];
		backUpArr[3] = numArr[3];
		backUpArr[4] = numArr[4];
//		
//		위에 값이랑 아래 값이랑 같다		
//
//		for (int i = 0; i < numArr.length; i++) {
//			backUpArr[i] = numArr[i];
//		}
		
		for (int i = 0; i < numArr.length; i++) {
			
			System.out.println(i+1 + "번째 값 : " + numArr[i]);
		}
		System.out.println();
		
		for (int i = 0; i < backUpArr.length; i++) {
		
			System.out.println(i + "번째 값 : " + backUpArr[i]);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for (int i = 0; i < numArr.length; i++) {
			
			numArr[i] = numArr[i] * 5;
			System.out.println(i + "번째 값 : " + numArr[i]);
		}
		System.out.println();
		
		for (int i = 0; i < backUpArr.length; i++) {
			
			System.out.println(i + "번째 값 : " + backUpArr[i]);
			for(int a = 5; a < backUpArr.length; a++) {
				backUpArr[a] = a;
			}
		}
	}

}
