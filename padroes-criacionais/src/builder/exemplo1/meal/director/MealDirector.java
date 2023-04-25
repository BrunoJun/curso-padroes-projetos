package builder.exemplo1.meal.director;

import builder.exemplo1.meal.builder.FastFoodMealBuilder;
import builder.exemplo1.meal.model.FastFoodMeal;

public class MealDirector {

    FastFoodMealBuilder builder;

    public MealDirector(FastFoodMealBuilder builder) {

        this.builder = builder;
    }

    public void constructorMeal(){

        builder.getDrink();
        builder.getMain();
        builder.getSide();
        builder.getDessert();
        builder.getGift();
    }

    public FastFoodMeal getMeal() {

        return builder.getMeal();
    }
}
