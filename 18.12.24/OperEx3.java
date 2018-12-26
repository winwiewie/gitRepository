
public class OperEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		단항연산자  (--) : 피연산자의 값을 1 감소시킨다.
//		증감 연산자 (++) : 피연산자의 값을 1 증가시킨다
		
		int i = 5;
//		i++;	//후위형 ->  i의 값을 쓴 다음에 i의값을 증가시킨다. 
//		ㄴ>을 해석하면 
//		i;
//		i = 5;
//		i = i+1;		
		
		System.out.println(i++);

		
		i = 5;
		++i;	//전위형 -> i = i + 1  ->  i의 값을 쓰기전에 i의 값을 증가시킨다.
		
		System.out.println(i);
	
	}

}
