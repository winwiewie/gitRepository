
public class ForFlowEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		중첩 for문
//		특징
//가로  (행)  세로 (열)	
//		1	 2	 3	
//		2
//		3
		
		for(int i = 1; i <= 3; i++) {
			System.out.println("첫번째 for문 : " + i);	
			
			for(int n = 1; n <= 2; n++) {
				System.out.println("       두번째 for문 : " + n);
			}
		}
	}

}
