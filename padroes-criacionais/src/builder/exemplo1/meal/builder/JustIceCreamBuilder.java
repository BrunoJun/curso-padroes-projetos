package builder.exemplo1.meal.builder;

import builder.exemplo1.meal.model.FastFoodMeal;

public class JustIceCreamBuilder extends FastFoodMealBuilder {
    @Override
    public void getDessert() {

        meal.setDessert("Ice Cream");
    }
}
