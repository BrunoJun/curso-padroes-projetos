package strategy.exemplo2.worker.strategies.transportation;

public class AirplaneTransportation implements TransportationStrategy{

    @Override
    public void move() {

        System.out.println("I use an airplane to go (almost) anywhere");
    }
}
