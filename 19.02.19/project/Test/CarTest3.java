package project.Test;

import project.car.*;


public class CarTest3 {
	public static void main(String[] args) {
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		
		fe.door = 2;
		System.out.println("fe.door : "+ fe.door);
		
		car = fe;
		System.out.println("car.door : " + car.door);
//		car.water();
		
		car.door = 4;
		fe2 = (FireEngine)car;
		System.out.println("fe2.door : " + fe2.door);
		
		System.out.println("한바퀴를 돌고 온 fe.door : " + fe.door);
		int num = 4;
		byte b = 0;
		
		b = (byte)num;
		
		
		
	}
}
