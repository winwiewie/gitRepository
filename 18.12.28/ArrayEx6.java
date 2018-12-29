
public class ArrayEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		관련있는 정수들의 변수
//		scoreArr [0] = 성적		국어			
//		scoreArr [1] = 성적		영어
//		scoreArr [2] = 성적		수학	

		double ave = 0.0;
		int sum = 0;

		int[] socreArr = { 100, 88, 100, 100, 90, 87, 86, 12 };

		for (int i = 0; i < socreArr.length; i++) {
			sum = sum + socreArr[i];
		}
		
		ave = (double)sum / socreArr.length;
		ave =  (int)(ave * 100) / 100.0;	
		
//		ave = sum * 100 / socreArr.length / 100.0;


		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + ave);
	}

}
