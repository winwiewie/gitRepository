
public class DrinkCoffeeTest {

	public static void main(String[] args) {
		

		Drink drink = new Drink();
		
		drink.name = "사이다";
		drink.volume = 100;
		drink.price = 1000;
		drink.info();
		
		Coffee coffee = new Coffee();
	
		System.out.println();
		
		coffee.name = "카페라떼";
		coffee.volume = 300;
		coffee.price = 2000;
		coffee.Caffeine = 10;
		coffee.info();
		
	}
}
