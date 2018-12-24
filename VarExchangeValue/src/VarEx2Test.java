
public class VarEx2Test {

	public static void main(String[] args) {
		
		int num1 = 400;
		int num2 = 300;
		int num3 = 200;
		int tmp = 0;
		
		System.out.println("num1 : " + num1 + " num2 : " + num2 + " num3 : " + num3 );
		System.out.println();
		
	   //	300
	   //	400
	   //	200
		
		tmp = num1;
		num1 = num2;
		num2 = tmp;

		System.out.println("num1 : " + num1 + " num2 : " + num2 + " num3 : " + num3 );
		System.out.println();
		
		// 300
		// 200
		// 400
		
		tmp = num2;
		num2 = num3;
		num3 = tmp;
		
		System.out.println("num1 : " + num1 + " num2 : " + num2 + " num3 : " + num3 );
		System.out.println();
		
		// 200	
		// 300
		// 400
		
		tmp = num1;
		num1 = num2;
		num2 = tmp;
		
		System.out.println("num1 : " + num1 + " num2 : " + num2 + " num3 : " + num3 );
		
	}
}
