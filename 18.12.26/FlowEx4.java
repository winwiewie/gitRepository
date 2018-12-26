
public class FlowEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		if - else if - else문
		
//		표현식
//		if(조건식1) {
//			조건식1의 연산결과가 참 일때 수행될 문장들을 적는다 	false면 조건식2 로
//		}else if(조건식2){	
//			조건2의 연산결과과 가 참 일때 수행될 문장들을 적는다	false면 조건식3 로
//		}else if(조건식3){
//			조건3의 연산결과과 가 참 일때 수행될 문장들을 적는다	false면 else문을 실행
//		}else{
//			위의 어느 조건도 마족하지 않을때 수행될 문장들을 적는다.
//		}
//	
		
		int num = 3;
		
		if(num == 0) {
			System.out.println("처음오셧네요 쿠폰을 발행합니다");
		}else if(num % 5 == 0) {
			System.out.println(num + "번째입니다. 무료로 음료 하나 선택가능합니다");
			System.out.println("단, 3000원 이하만 가능합니다.");
		}else if(num == 9) {
			System.out.println("쿠폰을 다 사용했습니다.");
		}else {
			num++;
		}
		
		System.out.println("현재 쿠폰의 개수 " + num);
	}

}
