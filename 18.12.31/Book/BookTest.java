
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book Book1 = new Book();
		Book Book2 = new Book();
		
		Book1.price = 30000;
		Book1.bookName = "자바의 정석";
		
		Book2.price = 20000;
		Book2.bookName = "성경책";
		
		System.out.println(Book1.bookName + "은 " + Book1.price + "원이다");
		System.out.println(Book2.bookName + "은 " + Book2.price + "원이다");
		
	}

}
