import java.util.Scanner;

public class MyCalculatorTest {

	public static void main(String[] args) {

//		사용자의 입력을 받을수 있다
		
		Scanner scan = new Scanner(System.in);
		
		MyCalculator mc = new MyCalculator();
		
		double num1;
		double num2;
		int num3;
		int num4;
		
		System.out.println("정수만 입력하시오");
		num3 = scan.nextInt();
		System.out.println("정수만 입력하시오");
		num4 = scan.nextInt();
		
		mc.add(num3, num4);
		mc.subtract(num3, num4);
		mc.multiply(num3, num4);
		mc.division(num3, num4);
	
		System.out.println("실수만 입력하시오");
		num1 = scan.nextDouble();
		System.out.println("실수만 입력하시오");
		num2 = scan.nextDouble();
		
		mc.add(num1, num2);
		mc.subtract(num1, num2);
		mc.multiply(num1, num2);
		mc.division(num1, num2);
		
		int[] numArr = new int[3];
		
	
		
	}
}
