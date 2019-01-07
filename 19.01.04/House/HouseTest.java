import java.util.Scanner;

public class HouseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int window = 0;		
		int door = 0;	
		int room = 0;	
		
		window = 20;
		door = 5;		
		room = 5;
		
		House bigHome = new House(window,door,room);
		House middleHome = new House(window,door);
		House smallHome = new House(window);
		
		bigHome.Print();
		middleHome.Print();
		smallHome.Print();
		
		
		
	}

}
