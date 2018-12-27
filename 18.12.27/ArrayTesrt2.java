
public class ArrayTesrt2 {

	public static void main(String[] args) {

		int[] score = new int[6];

//		for (int i = 0; i < 6; i++) {
//			score[i] = score[i] * 10;
//		}
//		for (int i = 0; i < 6; i++) {
//			System.out.println(score[i]);
//		}
		int cnt = 0;
		
		while(cnt < score.length) {
			score[cnt] = cnt;
			
			cnt++; 
		}
		
		cnt = 0;
		
		while(cnt < score.length) {
			score[cnt] = score[cnt] * 10;
			
			System.out.println(score[cnt]);
			cnt++; 
		}
//		
//		score[0] = 0;
//		score[1] = 10;
//		score[2] = 20;
//		score[3] = 30;
//		score[4] = 40;
//		score[5] = 50;
//		
//		System.out.println(score[0]);
//		System.out.println(score[1]);
//		System.out.println(score[2]);
//		System.out.println(score[3]);
//		System.out.println(score[4]);
//		System.out.println(score[5]);
	}
}
