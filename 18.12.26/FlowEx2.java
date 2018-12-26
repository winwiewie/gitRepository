
public class FlowEx2 {

	public static void main(String[] args) {
		
		int score = 0;
		
		score = 60;
		
		
		if(score >=60 ) {	
		//if문은 오로지 한줄만 가능함 -> 60이상이 아니라서 "합격입니다"는 안뜨지만 "축하합니다"는 뜸 
			
			System.out.println("합격입니다");
			System.out.println("축하합니다");
		}
		
		if(score == 60) {
			System.out.println("아슬아슬하게 합격햇습니다.");
		}
	}
}
