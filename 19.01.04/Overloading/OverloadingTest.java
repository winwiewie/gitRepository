import java.util.Scanner;

public class OverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		MyCalc mc = new MyCalc();
//		
//		int result = 0;
//		
//		
//		result = mc.add(3, 5);
//		
//		System.out.println(result);
//		
//		result = (int)mc.add(3L, 5L);
//		
//		
//		System.out.println(result);
		
		MyCalc mc = new MyCalc();
		Scanner scan = new Scanner(System.in);
		long result = 0;
		
		int[] numArr = new int[4];
		
		System.out.println("숫자를 입력해 주세요");
		for (int i = 0; i < numArr.length; i++) {
			int num;
			num = scan.nextInt();
			numArr[i] = num;
		}
	
		
//		numArr[0] = 150;
//		numArr[1] = 200;
//		numArr[2] = 300;
//		numArr[3] = 400;
		
		result = mc.add(numArr);
		
		System.out.println(result);
	}

}
