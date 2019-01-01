
public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scoreArr = new int[5];
		
		scoreArr[0] = 5;
		scoreArr[1] = 8;
		scoreArr[2] = 2;
		scoreArr[3] = 10;
		scoreArr[4] = 7;
		
		int temp = 0;
		
		System.out.println("정렬전");
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.print(scoreArr[i] + " ");
			
		}
		
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < scoreArr.length; i++) {
			for (int n = 0; n < scoreArr.length-1; n++) {
				if(scoreArr[n] < scoreArr[n+1]) {
					temp = scoreArr[n];
					scoreArr[n] = scoreArr [n+1];
					scoreArr[n+1] = temp;
				}
					
			}
		}
		
		System.out.println("정렬후 ");
		
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.print(scoreArr[i]+" ");
		}
	}

}
