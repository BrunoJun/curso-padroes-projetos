package strategy.exemplo2.worker.strategies.eat;

public class VeganFood implements EatStrategy{

    @Override
    public void eat() {

        System.out.println("I eat veggie food.");
    }
}
