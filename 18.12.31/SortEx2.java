import javax.swing.text.StyledEditorKit.ForegroundAction;

public class SortEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scoreArr = new int[5];
		
		scoreArr[0] = 15;
		scoreArr[1] = 11;
		scoreArr[2] = 1;
		scoreArr[3] = 3;
		scoreArr[4] = 8;
		
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.print(scoreArr[i] + " ");
		}
		
		System.out.println();
		System.out.println("오름차순으로 정렬");
		
		int temp = 0;
		
		for (int i = 0; i < scoreArr.length; i++) {
			for (int n = 0; n < scoreArr.length-1; n++) {
				if(scoreArr[n] > scoreArr[n+1]) {
					temp = scoreArr[n];
					scoreArr[n] = scoreArr [n+1];
					scoreArr[n+1] = temp;
				}
			}
		}
//		n  n+1
// i	15 11 1 3 8   <-15,11 비교 후 n의값이 n+1 값보다 커서 자리를 옮긴다. 
//		11 15 1 3 8			ㄴ 그후 n이 n++ 되서 15랑 1를 비교 -> 순차적으로 비교를 계속한다. 	
//		11 1 15 3 8
//		11 1 3 15 8
//		11 1 3 8 15
		
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.print(scoreArr[i] + " ");
		}
	}
	

}
