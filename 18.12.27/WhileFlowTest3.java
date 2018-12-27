
public class WhileFlowTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		int a = 0;

		i = 1;
		a = 1;

		while (i < 10) {
			i++;

			while (a < 10) {
				System.out.println(i + " * " + a + " = " + i * a);
				a++;
			}

		}
	}
}
