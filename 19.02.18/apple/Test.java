package apple;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human human = new Human();
		
		human.name = "모르는 사람";
		human.age = 1;
		human.applename ="사과";
		human.color = "빨강색";
		
		
		Human2 human2 = new Human2();
		
		human2.name = "사과를 먹는 사람";
		human2.age = 2;
//		human2.apple = new Apple();
		Apple apple = new Apple();
		
		apple.color = "빨강색";
		
//		human2.apple.name = "나만의 특별한 사과";
	
		human2.apple = apple;
		human2.apple.showAppleInfo();
		
		System.out.println();
		
		human2.apple = new Apple("거창 사과","초록색");
		human2.apple.showAppleInfo();
	}

}
