package Private;

public class Book {

	private String bookTitle = "";
	private String bookAuthor = "";
	private String bookPublisher = "";
	private int bookPrice = 0;
	private String bookDate = "";
	
//	----------------------bookTitle----------------------------------
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	public String getBookTitle() {
		return bookTitle;
	}
//	----------------------bookAuthor----------------------------------
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	public String getBookAuthor() {
		return bookAuthor;
	}
	
//	------------------------bookPublisher---------------------------------
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	
	public String getBookPublisher() {
		return bookPublisher;
	}
//	------------------------bookPrice---------------------------------
	
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	public int getBookPrice() {
		return bookPrice;
	}
	
//	------------------------bookDate---------------------------------	
	public void setBookDate(String bookDate) {
		this.bookDate = bookDate;
	}
	
	public String getBookDate() {
		return bookDate;
	}
	
}
