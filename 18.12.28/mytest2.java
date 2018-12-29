
public class mytest2 {

	public static void main(String[] args) {
		
//		1부터 100까지의 짝수의 합
//		1부터 100까지의 홀수의 합	
		
		int sum1;
		int sum2;
		
		sum1 =0;
		sum2 =0;
		
		for (int i = 0; i < 100; i++) {
			if(i % 2 == 0) {				
				sum1 = sum1 + (i + 1);		
			}else {
				sum2 = sum2 + (i + 1);
			}
		}
		
		System.out.println("1부터 100까지의 짝수의 합 : " + sum1);
		System.out.println("1부터 100까지의 홀수의 합 : " + sum2);
		 
	}
}
