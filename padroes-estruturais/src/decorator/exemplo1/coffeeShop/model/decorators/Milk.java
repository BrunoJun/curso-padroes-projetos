package decorator.exemplo1.coffeeShop.model.decorators;

import decorator.exemplo1.coffeeShop.model.Drink;

public class Milk extends DrinkDecorator{

    public Milk(Drink drink) {

        super(drink);
    }

    @Override
    public void serve() {

        getDrink().serve();
        System.out.println("- Adding 30ml of milk");
    }

    @Override
    public Double getPrice() {

        return getDrink().getPrice() + 0.5;
    }
}
