
public class FlowEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
//		else문
	
//		표현식
//		if(조건식) {
//			조건식이 True 일때 수행될 문장들을 적는다.
//		}else{
//			조건식이 false 일때 수행될 문장들을 적는다.
//		}
		
//		else문은 혼자 존재할수 업고 if문이 있어야 사용이 가능하다.	
		
		int visitCount = 0;
		
		if (visitCount == 0) {
			System.out.println("처음 오셧군요. 방문해 주셔서 감사합니다");		
		}else {
			System.out.println("다시 방문해 주셔서 감사합니다");
		}
		
		System.out.println("방문횟수는 " + (visitCount + 1) + "회 입니다.");
		
	}

}
