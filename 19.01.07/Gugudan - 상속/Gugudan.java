
public class Gugudan {

	void perfectGugudan() {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				int sum = 0;
				sum = i * j;
				System.out.print(i + " * " + j + " = " + sum + "\t");
			}
			System.out.println();
		}
	}
}
