
public class NotebookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Notebook.makeMade = "LG";
		
		Notebook noteBook = new Notebook(500000,1000,8);		
		noteBook.Print();
		
		Notebook noteBook1 = new Notebook(480000,900,8);
		noteBook1.Print();
		
		Notebook noteBook2 = new Notebook(650000,1200,16);
		noteBook2.Print();
	}

}
