package decorator.exemplo1.coffeeShop;

import decorator.exemplo1.coffeeShop.model.Drink;
import decorator.exemplo1.coffeeShop.model.Expresso;
import decorator.exemplo1.coffeeShop.model.Tea;
import decorator.exemplo1.coffeeShop.model.decorators.DoubleDrink;
import decorator.exemplo1.coffeeShop.model.decorators.Milk;

public class Client {
	
	public static void order(String name, Drink drink) {
		System.out.println("Ordering a " + name);
		drink.serve();
		System.out.println(drink.getPrice());
		System.out.println("---------------");
	}

	public static void main(String[] args) {
		order("Expresso", new DoubleDrink(new Expresso()));
		order("Tea", new Milk(new Tea()));
		
	}
}
