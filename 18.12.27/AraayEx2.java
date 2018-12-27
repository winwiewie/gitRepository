
public class AraayEx2 {

	public static void main(String[] args) {

//		배열 Array[]
//		배열의 명명규칙
//		변수값 + Arr
//		num + Arr		
		int[] numArr = new int[3];
		numArr[0] = 1;
		numArr[1] = 2;
		numArr[2] = 3;

		int[] scoreArr = {1, 2, 3};  //		배열은 한번 공간이 지정 되면, 두번 다시 공간을 지정할수 없다.	
		int[] jumsuArr = new int[] {4, 5, 6};

		System.out.println(scoreArr[2]);
		
		scoreArr[2] = 300;  // 3의 값이 300으로 변경됨
		
		System.out.println(scoreArr[2]);
		
	}
}