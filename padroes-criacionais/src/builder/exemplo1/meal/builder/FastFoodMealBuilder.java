package builder.exemplo1.meal.builder;

import builder.exemplo1.meal.model.FastFoodMeal;

public abstract class FastFoodMealBuilder {
	
    FastFoodMeal meal;

    public FastFoodMealBuilder() {

        this.meal = new FastFoodMeal();
    }

    public FastFoodMeal getMeal() {

        return meal;
    }

    public void getDrink(){};
    public void getMain(){};
    public void getSide(){};
    public void getDessert(){};
    public void getGift(){};
}
