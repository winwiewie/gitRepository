
public class WhileFlowTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0;
		int sum = 0;
	
		num = 1;
		
		while(num <= 10) {
			sum = num + sum;
			
			System.out.println(num + " - " +  sum);
			num++;
		}
		
	}

}
