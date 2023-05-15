package strategy.exemplo2.worker.jobs;

import strategy.exemplo2.worker.strategies.eat.MeatFood;
import strategy.exemplo2.worker.strategies.transportation.AirplaneTransportation;
import strategy.exemplo2.worker.strategies.work.PilotStrategy;

public class Pilot implements Worker {

	@Override
	public void eat() {

		new MeatFood().eat();
	}

	@Override
	public void move() {

		new AirplaneTransportation().move();
	}

	@Override
	public void work() {

		new PilotStrategy().work();
	}
}
