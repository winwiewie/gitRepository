
public class OpEx5 {

	public static void main(String[] args) {
		
//		int n = 0;
//		
//		n = -10 + 2;
//		
//		System.out.println(n);
//		
//		n= -n;
//		
//		System.out.println(n);
		
		int num = 0;
		int secondNum = 0;
		
		num = 10;
		secondNum =4;
		
		System.out.printf("%d + %d = %d\n", num , secondNum, num+secondNum );
		System.out.printf("%d - %d = %d\n", num , secondNum, num-secondNum );
		System.out.printf("%d * %d = %d\n", num , secondNum, num*secondNum );
		System.out.printf("%d / %d = %d\n", num , secondNum, num/secondNum );
//		int / int -> 10/4 -> 2		정수형 / 정수형 = 정수형이라서 이렇게나옴 
		
		System.out.printf("%d / %f = %f\n", num , (float)secondNum, num/(float)secondNum );
	}
}
