package tg.exam.two;

public class AscendingService {
	
	//	임의의 정수 10개 
	int[] numArr = new int[10];
	
	// 1~99까지의 임의의 정수 10개를 배열에 저장 
	public void numbersCreate(){
		// 임의의 정수
		int rndNum = 0;
		
		System.out.println("10개의 난수를 생성합니다.");
		
//		10개의 난수 생성
		for (int i = 0; i < numArr.length; i++) {
			rndNum = (int)(Math.random() * 99) + 1;
			
			numArr[i] = rndNum;
		}
		
	}
	
	//	오름차순 정렬
	public void numbersAscending() {
		int temp = 0;
		// 숫자들의 교환이 있는지 판별, 교환이 있으면 true 
		boolean changeCheck = false;
		
		System.out.println("10개의 숫자들을 오름차순으로 정렬합니다");
		
		for (int i = 0; i < numArr.length-1; i++) {
			for (int n = 0; n < numArr.length-1-i; n++) {
				// 앞의 숫자가 크면 자리 교환
				if(numArr[n] > numArr[n+1]) {
					temp = numArr[n];
					numArr[n] = numArr[n+1];
					numArr[n+1] = temp;
					
					// 교환 발생
					changeCheck = true;
				}
				
			}
			// 교환이 발생하지 않았으면 정렬 완료
			if(changeCheck == false) {
				break;
			}
		}
	}

	// 숫자들을 출력
	public void numbersPrint() {
		System.out.println("[숫자들 조회]");
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i]);
			if(i == (numArr.length-1)) {
				break;
			}
			System.out.print(", ");
		}
		
		System.out.println();
	}
	
	
}
