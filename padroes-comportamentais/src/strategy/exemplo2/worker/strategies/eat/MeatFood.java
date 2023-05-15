package strategy.exemplo2.worker.strategies.eat;

public class MeatFood implements EatStrategy{

    @Override
    public void eat() {

        System.out.println("I love meat food.");
    }
}
