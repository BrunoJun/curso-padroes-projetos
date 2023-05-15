package strategy.exemplo2.worker.strategies.transportation;

public class CarTransportation implements TransportationStrategy{

    @Override
    public void move() {

        System.out.println("I use a Car to go anywhere");
    }
}
