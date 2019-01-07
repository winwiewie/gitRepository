
public class House {

//	기본 생성자
//	창문만 초기화 가능한 생성자
//	창문과 문만 초괴화 가능한 생성자
//	창문,문,방모두 초기화 가능한 생성자
	
	int window = 0;
	int door = 0;
	int room = 0;
	
	House(){
		
	}
	
	House(int homeWindow){
		window = homeWindow;

	}
	
	House(int homeWindow, int homeDoor){
		window = homeWindow;
		door = homeDoor;
	}
	
	House(int homeWindow, int homeDoor, int homeRoom){
		window = homeWindow;
		door = homeDoor;
		room = homeRoom;
	}
	
	void Print() {
		System.out.println("창문 " + window + " 문 : " + door + " 방 : " + room + "개인" );
		System.out.println("집이지어졌습니다.");
	}
}
