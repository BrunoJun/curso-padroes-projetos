package strategy.exemplo2.worker.strategies.work;

public class DeveloperStrategy implements WorkStrategy{

    @Override
    public void work() {

        System.out.println("I am a Developer.");
    }
}
