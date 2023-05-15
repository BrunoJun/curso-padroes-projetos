package strategy.exemplo2.worker.jobs;

import strategy.exemplo2.worker.strategies.eat.VeganFood;
import strategy.exemplo2.worker.strategies.transportation.BikeTransportation;

public class HispsterDeveloper implements Worker {

	@Override
	public void eat() {

		new VeganFood().eat();
	}

	@Override
	public void move() {

		new BikeTransportation().move();
	}

	@Override
	public void work() {

		new Developer().work();
	}
}
