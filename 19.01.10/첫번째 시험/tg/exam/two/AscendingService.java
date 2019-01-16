package tg.exam.two;

public class AscendingService {

	int[] number = new int[99]; // 99개의 배열 생성
	int temp = 0; // 숫자를 백업하기 위해서 선언
	
	public AscendingService() { // 기본 생성자

	}

	public void numbersCreate() {

		// 배열에 1~99 값을 저장한다
		for (int i = 0; i < number.length; i++) {
			number[i] = i + 1;
		}

 	
		int rndNum = 0;	

		for (int i = 0; i < 99; i++) { // 0~99 값을 섞기 위해서 한것
			rndNum = (int) (Math.random() * 99); // 0~99의 값을 랜덤으로 하나를 뽑아내서 rndNum에 넣는다.
			temp = number[i];
			number[i] = number[rndNum];
			number[rndNum] = temp;
		}
		System.out.println("10개의 난수를 생성합니다.");
	}
	public void numbersAscending() { // 오름차순으로 정렬
	
		for (int i = 0; i < 10; i++) {
			for (int n = 0; n < 10; n++) {
				if (number[i] < number[n]) {   // number[i]와 number[n] 의 값을 비교후 number[n]이 크면 
					temp = number[i];		   // n이랑 i의 값의 자리를 바꿔 비교하는 형식으로 오름차순한다.
					number[i] = number[n];
					number[n] = temp;
				}
			}
		}
		System.out.println("10개의 숫자들을 오름차순으로 정렬합니다.");

	}
	public void numbersPrint() {				//10개의 숫자를 보여준다
		System.out.println("[숫자들 조회]");
		for (int i = 0; i < 9; i++) {			//9개의 숫자만 보여주기 위한 for문
			System.out.print(number[i] + ", ");
		}
		System.out.print(number[9]);		// 10개중 마지막 숫자를 보여준다
		System.out.println();
	}
}
