
public class TotalEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1~100까지의 합
//		1
//		3
//		6

		int sum = 0;

		for (int i = 0; i < 100; i++) {
			
			
			if(sum + (i+1) > 100) {
					
				break;
			}
			
			sum = sum + (i + 1);
		}
		
		System.out.println(sum);
	}
}
