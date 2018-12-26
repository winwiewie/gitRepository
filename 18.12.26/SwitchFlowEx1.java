import javafx.geometry.Side;

public class SwitchFlowEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		switch
//		표현식
//		switch (조건식) {
//		case 값1:
//				조건식의 결과가 값1와 같을 경우 수행될 문장들
//			break;
//		case 값2:
//				조건식의 결과가 값2와 같을경우 수행될 문장들
//			break;
//		default:
//			조건식의 결과와 일치하는 case문이 없을 때 수행될 문장들 	
//			break;
//		}
		
		int score = 0;
	
		score = 100;

						
		
		switch (score * 100) {
		case 100: case 101:	case 102:	//여러번 가능
			System.out.println("당신의 점수는 100이고, 상품은 자전거입니다.");
			break;			
		case 200:
			System.out.println("당신의 점수는 200이고, 상품은 TV입니다.");
			break;
		case 300:
			System.out.println("당신의 점수는 300이고, 상품은 노트북입니다.");
			break;	
		default:
			System.out.println("죄송하지만 당신의 점수에 해당상품이 없습니다.");
			break;
		}
		
	}

}
