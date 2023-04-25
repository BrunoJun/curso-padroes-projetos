package builder.exemplo1.meal.builder;

import builder.exemplo1.meal.model.FastFoodMeal;

public class MondayMenuBuilder extends FastFoodMealBuilder {

    @Override
    public void getDrink() {

        meal.setDrink("Coke");
    }

    @Override
    public void getMain() {

        meal.setMain("Big Mac");
    }

    @Override
    public void getSide() {

        meal.setSide("Fries");
    }

    @Override
    public void getDessert() {

        meal.setDessert("Apple Pie");
    }

    @Override
    public void getGift() {

        meal.setToy("Pokemon Figure");
    }
}
