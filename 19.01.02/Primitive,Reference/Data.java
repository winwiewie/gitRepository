
public class Data {

	int num = 0;

	void change(int param) {  
		System.out.println("param의 처음값 : " + param);
		param = 1000;
		System.out.println("메서드를 통해 param의 값 수정");
		System.out.println("data.num : " + param);
	}  // 볼록을 빠져나가는 순간 메서드랑 관련된 param의 변수는 사라짐
	
}
