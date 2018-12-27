import java.util.Scanner;

public class WhileFlowEx2 {
	
	public static void main(String[] args) {
		
//		업다운 게임
//		대학교 오리엔테이션

//		병뚜껑 숫자 확인 50

//		1 ~ 100
//		유저 : 10
//		심판 : 업	
//		유저 : 60
//		심판 : 다운
//		유저 : 50
//		심판 : 당첨
		
		int input = 0;
		int answer = 0;
		Scanner scan = new Scanner(System.in);
				
		answer = (int)(Math.random() * 100) +1;
//		1 ~ 100사이의 임의의 수를 저장
		
		while(true) {		//(조건식)에 true를 쓰면 언제든지 무한루프 만들기 가능
			System.out.print("1과 100사이의 숫자를 입력하세요 >>");
			input = scan.nextInt();
			System.out.println();
			
			if(input > answer) {
				System.out.println("더 작은 수를 입력해주세요");
			}else if(input < answer) {
				System.out.println("더 큰수를 입력해주세요");
			}else {
				System.out.println("정답은 " + answer );
				break;		// 무한 루프를 벗어나게 할수있음
			}
			
		}
		System.out.println("게임 종료");
		
//		for			vs		while
//   사용쉽다					사용하기 어려움
//   사용횟수 정해져잇음			몇 번 할지 모른다
		
	}
}
