package strategy.exemplo2.worker.strategies.transportation;

public class BikeTransportation implements TransportationStrategy{

    @Override
    public void move() {

        System.out.println("I ride a bike to go anywhere");
    }
}
