
public class Calc2 {
// ctrl + d : 한줄지우기, 블록 지우기
	
// 	return문
//	메서드를 정상적으로 종료가 되는 경우
//	- 메서드의 블럭{} 내의 마지막 문장까지 수행했을 때
//	- 메서드의 블럭{} 내에 있는 문장을 수행중 return 문을 만났을 때
		
	
//  반환타입 void(공허) - 반환할 값이 없을때 사용
	void add(int num, int secondNum) {
		int result = num + secondNum;
		
		System.out.println(num + " + " + secondNum + "의 결과는");
		System.out.println(result);
	}

}

