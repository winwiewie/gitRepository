

//카드케이스는 카드포함하고 있다. 
public class CardCase {

//	4 * 13 = 52
	int numOfCards = Card.shape.length * Card.number.length;
	Card[] cardArr = new Card[numOfCards];

//	card케이스 안에 카드 52장을 초기화해준다 만들어준다.
	CardCase() {
		int totalCnt = 0;

		for (int i = 0; i < Card.shape.length; i++) {
			for (int n = 0; n < Card.number.length; n++) {
				cardArr[totalCnt++] = new Card(i, n);
			}
		} // 전체 for문 종료
	} // 기본생성자 종료
	
//	임의의 위치의 카드를 뽑는다.
	Card pick() {
		int index =(int)(Math.random() * numOfCards);
		
		Card card = pick(index);
//		Card card = cardArr[index];
		
		return card;
	}
	
//	지정된 위치의 카드를 뽑느다.
	Card pick(int index) {
		
		return cardArr[index];
	}
	
//	카드를 섞는다.
	void shuffle() {
		int rand = 0;
		Card temp = null;
		
		for (int i = 0; i < cardArr.length; i++) {
			rand = (int)(Math.random() * numOfCards);
			
			temp = cardArr[i];
			cardArr[i] = cardArr[rand];
			cardArr[rand] = temp;
		}
	}
	
	
	void cardsView() {
		for (int i = 0; i < cardArr.length; i++) {
			System.out.print(cardArr[i].getCard() + " ");
			if((i+1) % 13 ==0) {
				System.out.println();
			}
				
		}
	}
}
