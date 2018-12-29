
public class ArrayEx8 {

	public static void main(String[] args) {

//		45개의 정수값을 저장하기 위한 배열 생성		
		int[] ballArr = new int[45];
		
		int num1;
		int num2;
		int temp1;
		
		num1 = 10;
		num2 = 20;
		
		temp1 = num1;
		num1 = num2;
		num2 = temp1;

		System.out.println("num1의 값은 : " + num1);
		System.out.println("num2의 값은 : " + num2);
		
//		배열의 각 요소에 1~45 값을 저장		
		for(int i = 0; i < ballArr.length; i++) {
			ballArr[i] = i +1;
		}
		
		int temp = 0;
		int rndNum = 0;
		
		for (int i = 0; i < 45; i++) {
			rndNum = (int)(Math.random() * 45);  // 0~44의 값을  랜덤으로 하나를 뽑아내서 rndNum에 넣는다.
			temp = ballArr[i];
			ballArr[i] = ballArr[rndNum];
			ballArr[rndNum] = temp;
		}
		
		System.out.println("자동선택 번호 : ");
		System.out.println("================");
		
		for (int i = 0; i < 6; i++) {
			System.out.print(ballArr[i] + " ");
		}
		
								

//		45개의 공확인		
//		for (int i = 0; i < ballArr.length; i++) {
//			System.out.print(ballArr[i] + " ");			

//			5번째 숫자마다 줄바꿈을 해준다		
			
//			if((i+1) % 5 == 0){
//				System.out.println();
//			}
//		}
	}
}
