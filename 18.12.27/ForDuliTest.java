
public class ForDuliTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for(int i = 0; i < 5; i++) {		// 행5
//			for(int n = 0; n <= i; n++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		*
//		**

		
		for (int i = 0; i < 5; i++) {
			for (int n = 4; n > i; n--) {
				System.out.print("r");
				}
			for (int a = 0; a <= i; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
// n/i
		
// 4/0	r		
// 3/0	rr	
// 2/0	rrr
// 1/0  rrrr	
// 1/1		

// a/i				

// 0/0	rrrr*
// 1/0		
	}

}
