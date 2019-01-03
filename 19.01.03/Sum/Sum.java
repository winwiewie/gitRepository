
public class Sum {

	int sum(int x) {
		int sum = 0;

		for (int i = 0; i <= x; i++) {
			sum = sum + i;

		}

		return sum;
	}

	void sum(int x, int y) {
		int sum = 0;
		
		sum = x + y;
		System.out.println(sum);
	}
}
