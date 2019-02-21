package Private;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		
		String title = "";
		String author = "";
		String bookPublisher = "";
		int price = 0;
		String date = "";
		
		book.setBookTitle("성경");
		title = book.getBookTitle();
		
		book.setBookAuthor("여러사람들");
		author = book.getBookAuthor();
		
		book.setBookPublisher("대한성서공회");
		bookPublisher = book.getBookPublisher();
		
		book.setBookPrice(15000);
		price = book.getBookPrice();
		
		book.setBookDate("2007년 9월 20일");
		date = book.getBookDate();
		
		System.out.println("┌──────────────────────┐");
		System.out.println("│책의 정보                               │");
		System.out.println("│책의 제목 :" + title+ "                      │");
		System.out.println("│지은이 :" + author + "                 │");
		System.out.println("│출판사 :" + bookPublisher + "              │");
		System.out.println("│가격 :" + bookPublisher + "                 │");
		System.out.println("│출판날짜ㅣ :" + date + " │");
		System.out.println("└──────────────────────┘");
	}

}
