package project.Test;

import project.car.*;


public class CarTest {
	public static void main(String[] args) {
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		System.out.println("fe.water() 실행");
		
		fe.water();
		car = fe;
		
//		car.water();
		
		fe2 = (FireEngine)car;
		fe2.water();
		
		
		int num = 4;
		byte b = 0;
		
		b = (byte)num;
		
		
		
	}
}
