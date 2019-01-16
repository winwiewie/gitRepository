
public class Gugudan {
//	made by 충현&강인
	
	Gugudan(){	//선언부 선언
		
	}

	void gugu(int x) {
		int sum = 0;
		
		for (int i = 2; i <= x; i++) {			//행
			for (int j = 1; j <= 9; j++) {		//열
				sum = i * j;
				System.out.print(i + " * "+ j + " = "+ sum + "\t");
			}
			System.out.println();
		}		
	}
	void gugu() {
		int sum = 0;
		
		for (int i = 1; i <= 9; i++) {			//열
			for (int j = 2; j <= 9; j++) {		//행
				sum = i * j;
				System.out.print(j + " * "+ i + " = "+ sum + "\t");
			}
			System.out.println();
		}		
	}
	
}
