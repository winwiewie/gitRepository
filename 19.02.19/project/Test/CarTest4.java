package project.Test;

import project.car.*;


public class CarTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FireEngine fe = new FireEngine();
		Car car = new Car();
		
		if(fe instanceof FireEngine) {
			System.out.println("이것이 FireEngine의 객체다");
		}
		if(fe instanceof Car) {
			System.out.println("이것이 car의 객체다");
		}
		if(fe instanceof Object) {
			System.out.println("이것이 Object의 객체다");
		}
		
		System.out.println("-----------------------------------");	
//		FireEngine fe2 = fe;
//		Car c = fe;
//		Object o = fe;	
//		Ambulance al = fe;
		
		if(car instanceof FireEngine) {
			System.out.println("이것이 FireEngine의 객체다");
		}
		if(car instanceof Car) {
			System.out.println("이것이 car의 객체다");
		}
		if(car instanceof Object) {
			System.out.println("이것이 Object의 객체다");
		}
	}

}
