
public class CardTest {

	public static void main(String[] args) {
		
		Card card = new Card();
		String myCard = "";
		int shapeIndex = 0;  // 모양 선택 0 "♥", 1 "◆",2 "♠",3 "♣"
		int cardChoiceNumber = 0; // 1~13

//		Scanner scan = new Scanner(System.in);
		shapeIndex = 3;
		cardChoiceNumber = 3;
		
//		card.init();
		card.init(shapeIndex, cardChoiceNumber);
		
		myCard = card.getCard();
		
		System.out.println("당신에게 준 카드는 ");
		System.out.println(myCard);
	}
}
