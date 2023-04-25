package builder.exemplo1.meal.builder;

public class TuesdayMenuBuilder extends FastFoodMealBuilder {

    @Override
    public void getDrink() {

        meal.setDrink("Pepsi");
    }

    @Override
    public void getMain() {

        meal.setMain("Chicken Burguer");
    }

    @Override
    public void getSide() {

        meal.setSide("Nuggets");
    }

    @Override
    public void getDessert() {

        meal.setDessert("Ice Cream");
    }

    @Override
    public void getGift() {

        meal.setToy("Superman Toy");
    }
}
