
public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card card1 = new Card();
		card1.kind = "Heart";
		card1.number = 7;
		
		Card card2 = new Card();
		card2.kind = "Spade";
		card2.number = 4;
		
		System.out.println("card1은 " + card1.kind + ", " + card1.number
				+ "이며, 크기는 " + card1.width + ", " + card1.height);
		System.out.println("card2은 " + card2.kind + ", " + card2.number
				+ "이며, 크기는 " + card2.width + ", " + card2.height);
		
		System.out.println();
		System.out.println("card1의 width와 height를 각각 50, 80으로 변경합니다");
		System.out.println();
		
		card1.width = 50;  // <-Card.width,width 가 스태틱 변수로 선언되어 잇어 card1뿐아니라 card2도 바뀐다 
		card1.height = 80;
		
		System.out.println("card1은 " + card1.kind + ", " + card1.number
				+ "이며, 크기는 " + card1.width + ", " + card1.height);
		System.out.println("card2은 " + card2.kind + ", " + card2.number
				+ "이며, 크기는 " + card2.width + ", " + card2.height);
	}

}
