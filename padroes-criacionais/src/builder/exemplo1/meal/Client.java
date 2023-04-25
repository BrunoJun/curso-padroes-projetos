package builder.exemplo1.meal;

import builder.exemplo1.meal.builder.FastFoodMealBuilder;
import builder.exemplo1.meal.builder.JustIceCreamBuilder;
import builder.exemplo1.meal.builder.MondayMenuBuilder;
import builder.exemplo1.meal.builder.TuesdayMenuBuilder;
import builder.exemplo1.meal.director.MealDirector;

public class Client {

	public static void order(String name, FastFoodMealBuilder builder) {
		System.out.println("Ordering a " + name);
		MealDirector director = new MealDirector(builder);
		director.constructorMeal();
		System.out.println(director.getMeal());

		System.out.println("------------------");
	}

	public static void main(String[] args) {
		order("Monday Menu", new MondayMenuBuilder());
		order("Tuesday Menu", new TuesdayMenuBuilder());
		order("Ice Cream", new JustIceCreamBuilder());
	}
}