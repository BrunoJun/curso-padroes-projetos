package strategy.exemplo2.worker.jobs;

import strategy.exemplo2.worker.strategies.eat.MeatFood;
import strategy.exemplo2.worker.strategies.transportation.CarTransportation;
import strategy.exemplo2.worker.strategies.work.DeveloperStrategy;

public class Developer implements Worker {

	@Override
	public void eat() {

		new MeatFood().eat();
	}

	@Override
	public void move() {

		new CarTransportation().move();
	}

	@Override
	public void work() {

		new DeveloperStrategy().work();
	}

}
