
public class MaxFind {

//	void Max(int num1,int num2)
//	{
//		if (num1 == num2) {
//			System.out.println("두개의 값이 같습니다. 다시입력해 주세요");
//			return;
//		} else if (num1 > num2) {
//			System.out.println(num1 + "의 값이 큽니다.");
//		} else {
//			System.out.println(num2 + "의 값이 큽니다.");
//		}
//	}
	
	int max(int num1, int num2) {
		int result=0;
		
		if (num1 > num2) {
			result = num1;
		} 
		else{
			result = num2;
		}
	
		return result;
	}

}
