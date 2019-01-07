
public class Card {

//	표현식 - 기본생성자
//	클래스 이름() {	}
	
	int number = 0;
	
//	설정에 필요한 내용을 초기화?? -> 메인 클래스에서 Card을 생성하고 호출함 
//	메인클래스에서 1이라고 되있으므로 값을  card int num에 1을넣고,number값에 1을 넣으니 넘버 값은 1
//	num은 초기화 되지만 card number에 1은 초기화 안되므로 1이다.??????
	
	Card(int num){		// 값이 있는 매개변수 생성자를 선언 한것
		number = num;
	}
	
	Card(int num,int num2){
		num = num + num2;
		number = num;
	}
	
//  값이 있는 매개변수 생성자를 선언하면 기본적인 생성자가 필요 없다고 생각하여 사라짐 
//	기본생성자가 필요하다
	Card(){
		
	}
}
