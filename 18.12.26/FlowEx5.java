import java.util.Scanner;

public class FlowEx5 {

	public static void main(String[] args) {

//		중첩 if문
//		if(조건식1) {
//			조건식 1의 연산결과가 true일때 수행될 문장들을 적는다
//			if(조건식2){
//				조건식1과 조건식2가 모두 true일 때 수행될 문장
//			}else{
//				조건식이1이 true 이고 조건식이 false일때 수행되는 문장들
//			}
//		}else {
//			조건식 1이 false일때 수행되는 문장들
//		}

		int score = 0;
		Scanner scan = new Scanner(System.in);
		String grade = "";

		System.out.println("자신의 점수를 입력해 주세요");
		score = scan.nextInt();

		if (score >= 90) {
			grade = "A";
			
			if (score >= 98) {
				grade = "A+";
			}else if (score >= 94) {
				grade = "A-";
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 88) {
				grade = "B+";
			} else if (score >= 84) {
				grade = "B-";
			}

		} else {
			grade = "F";
		}
		
		System.out.println(score + "점은  " + grade);
	
	}
}
