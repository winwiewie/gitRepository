
public class Gugudan {

	void gugu(int x) {
		int sum;
		
		for (int i = 2; i <= x; i++) {		//행
			for (int j = 1; j <= 9; j++) {	//열
				sum = i * j;
				System.out.print(i + " * "+ j + " = "+ sum + "  ");
			}
			System.out.println();
		}		
	}
	void gugu() {
		int sum;
		
		for (int i = 2; i <= 9; i++) {		//행
			for (int j = 1; j <= 9; j++) {	//열
				sum = i * j;
				System.out.print(i + " * "+ j + " = "+ sum + "  ");
			}
			System.out.println();
		}		
	}
	
}
