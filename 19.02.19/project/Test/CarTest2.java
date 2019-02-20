package project.Test;

import project.car.*;


public class CarTest2 {
	private static final String Ambulance = null;

	public static void main(String[] args) {

//		엠블런스를 부모 참조변수에 넣어서 기능을 돌린다.		
//		부모의 인스턴스를 앰뷸런스 참조변수에 넣어서 기능을 돌려본다.
		
	
		Ambulance  ambulance = new Ambulance();
		

		ambulance.siren();
		ambulance.drive();
		ambulance.stop();
	
		System.out.println("-------------------------");
//		Car car = new Ambulance();	똑같은 표현
		Car car = null;
		car = ambulance;
		
		car.drive();
		car.stop();
		

		System.out.println("-------------------------");
		Ambulance  ambulance2 = null;
		
		ambulance2  = (Ambulance)car;
		
		ambulance2.drive();
		ambulance2.siren();
		ambulance2.stop();
		
		System.out.println("-------------------------");
//		부모의 인스턴스를 앰뷸런스 참조변수에 넣어서 기능을 돌려본다.
		Car car3 = new Car();
		
		car3 = new Ambulance();
		
		car3.drive();
		car3.stop();
		
	}


}
