
public class CastingEX1Test {
	
	public static void main(String[] args) {
		
		int n = 0;
		double doubleNum = 21.124d;
		
		n = (int)doubleNum;
//		n = (int)21.124;		
//		n = 20;
		
		System.out.println("n : " + n);
		
		doubleNum = (double)n;
//		doubleNum = (double)20
//		doubleNum = 20.0
		
		System.out.println("doubleNum : " + doubleNum);
		
	}

}
