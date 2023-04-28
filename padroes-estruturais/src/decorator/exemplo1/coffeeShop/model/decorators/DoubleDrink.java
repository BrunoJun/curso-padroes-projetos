package decorator.exemplo1.coffeeShop.model.decorators;

import decorator.exemplo1.coffeeShop.model.Drink;

public class DoubleDrink extends DrinkDecorator{

    public DoubleDrink(Drink drink) {

        super(drink);
    }

    @Override
    public void serve() {

        getDrink().serve();
        getDrink().serve();
    }

    @Override
    public Double getPrice() {

        return getDrink().getPrice() * 2;
    }
}
