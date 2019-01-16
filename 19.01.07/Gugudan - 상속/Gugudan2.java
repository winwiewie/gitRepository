
public class Gugudan2 extends Gugudan {

	int danValue = 0;

	Gugudan2() {

	}

	void oneDanGugudan() {
		for (int i = 1; i < 10; i++) {
			int sum = 0;
			sum = i * danValue;
			
			System.out.print(danValue + " * " + i + " = " + sum + "\t");
		}
		System.out.println();
	}

}
