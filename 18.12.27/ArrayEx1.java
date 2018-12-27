
public class ArrayEx1 {

	public static void main(String[] args) {

//		ctrl + f -> 글자찾기및 변경
//		배열 Array[]
//		배열은 순서가 있다	
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		
		num1 = 1;
		num2 = 2;
		num3 = 3;
		num4 = 4;
		num5 = 5;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
			
		
		int[] score = new int[5];
//		5개의 int 값을 저장할수 잇는 배열을 생성한다.	
		
//		String[] num = new String[3];
//		변수가 전부다 됨

//		초기화		
		score[0] = 1;
		score[1] = 2;
		score[2] = 3;
		score[3] = 4;
		score[4] = 5;
		
		System.out.println(score[0]);
	}
}
