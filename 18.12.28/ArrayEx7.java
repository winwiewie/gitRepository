
public class ArrayEx7 {

	public static void main(String[] args) {
		
		int max = 0;
		int min = 0;
		
		int[] scoreArr = {
			79, 88, 91, 33, 100, 55, 95
		};
		
		max = scoreArr[0];		
		min = scoreArr[0];
		
		
		for (int i = 0; i < scoreArr.length; i++) {
			if(scoreArr[i] > max) {
				max = scoreArr[i];	
				
			}else if (scoreArr[i] < min) {
				min = scoreArr[i];
			}
			
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println();

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~		
		
		max = scoreArr[0];		
		min = scoreArr[0];
		
		for (int i = 0; i < scoreArr.length; i++) {
			if(scoreArr[i] > max) {
				max = scoreArr[i];	
			}
		}
		
		for (int i = 0; i < scoreArr.length; i++) {
			if(scoreArr[i] < min) {
				min = scoreArr[i];	
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println();

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~			
		
		for (int i = 0; i < scoreArr.length; i++) {
			while(scoreArr[i] > max) {
				max = scoreArr[i];
				i++;
			}				
		}
		
		for (int i = 0; i < scoreArr.length; i++) {
			while(scoreArr[i] < min) {
				min = scoreArr[i];
				i++;
			}				
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}
