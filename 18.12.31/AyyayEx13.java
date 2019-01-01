
public class AyyayEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		2차원 배열
		
//		int형 타입의 4행 3열의 2차원 배열을 생성한다. 		
		int[][] scoreArr = new int[4][3];
		
		int cnt = 1;
		
		for (int i = 0; i < scoreArr.length; i++) {
			for (int n = 0; n < scoreArr[0].length; n++) {  	//scoreArr[0].length -> 0번째 행 에서 열의 갯수를 출력
				scoreArr[i][n] = cnt++;
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int n = 0; n < 3; n++) {
				System.out.print("[" + scoreArr[i][n] + "] ");
			}
			System.out.println();
		}
		
	}

}
