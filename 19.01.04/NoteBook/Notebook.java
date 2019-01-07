
// 멤버변수
// 클래스 내에 포함되어 있는 모든 변수들을 총칭하는 용어
// 지역변수는 제외

// 멤버메서드
// 클래스 내에 포함되어 있는 모든 매서들을 총칭하는 용어


public class Notebook {

// 	제조사 		LG	
//	가격			다를수있다.
//	hardDisk	다를수있다
// 	memory		다를수있다.

//  변수를 찾는 순서	
//	지역변수 -> 상위 인스턴스 변수
	
	static String makeMade = "";
	int price = 0;
	int hardDisk = 0;
	int memory = 0;
	
	Notebook(){
		
	}
	
	Notebook(int pirce, int hardDisk, int memory){
		this.price = pirce;
		this.hardDisk = hardDisk;
		this.memory = memory;
	}
	
	void Print() {
		System.out.println("제조사 : " + Notebook.makeMade);
		System.out.println("가   격 : " + price);
		System.out.println("용   량 : " + hardDisk + "GB");
		System.out.println("메모리 : " + memory + "G");
		System.out.println();
		
	}
}
