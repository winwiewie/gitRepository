
public class AraayEx3 {

	public static void main(String[] args) {
		
		int[] numArr = new int[3];
		numArr[0] = 1;
		numArr[1] = 2;
		numArr[2] = 3;

		for (int i = 0; i < numArr.length; i++) {		//배열.length -> 배열의 길이를 알수있다.
			System.out.println((i+1)+ "번째 수행 : " + numArr[i]);
			
		}
	}
}
