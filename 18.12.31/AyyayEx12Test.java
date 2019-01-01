
public class AyyayEx12Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		2차원 배열
		
		int[][] scoreArr = {
									//			0열	  1열	2열			
				{100, 100, 100},	// 0번째행	0,0   0,1	0,2
				{20, 20, 20},		// 1번째행	1,0	  1,1	1,2
				{30, 30, 30},		// 2번째행	2,0	  2,1	2,2	
				{40, 40, 40},		// 3번째행	3,0   3,1   3,2
				{50, 50, 50},		// 4번째행	4,0	  4,1	4,2
		};
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("["+ scoreArr[i][j] + "] ");
			}
			
			System.out.println();
		}
		
		
	}

}
