
public class SnackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Snack snack = new Snack("칸쵸", 1000, "한국");

		snack.snackPrint();
		SnackBox.namePrint();

		Snack snack2 = new Snack("오징어집", 500, "한국");

		snack2.snackPrint();
		SnackBox.namePrint();

	}

}
