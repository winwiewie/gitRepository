import java.util.Scanner;

public class ControlTest3 {

	public static void main(String[] args) {

		int score = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("점수를 입력해 주세요");
		score = scan.nextInt();

		if (  score >= 90 && score < 101) {
//				90이상		101 미만			
			System.out.println(score + "점은  A");
			
		} 
		else if (score >= 80 ) {
			System.out.println(score + "점은  B");
		}
		
		else if (score >= 70 ) {
			System.out.println(score + "점은  C");
	
		} else if(score < 70 && score >= 0){
//				   70미만			0이상			
			System.out.println(score + "점은  F");
			
		}else {
			System.out.println("잘못입력된 값입니다.");
		}

	}

}
