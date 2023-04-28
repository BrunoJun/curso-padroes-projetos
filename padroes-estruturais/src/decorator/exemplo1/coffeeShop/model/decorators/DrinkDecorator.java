package decorator.exemplo1.coffeeShop.model.decorators;

import decorator.exemplo1.coffeeShop.model.Drink;

public abstract class DrinkDecorator implements Drink {

    private Drink drink;

    public DrinkDecorator(Drink drink) {

        this.drink = drink;
    }

    public Drink getDrink() {

        return drink;
    }
}