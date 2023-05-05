package ChainOfResponsability.exemplo1.billsDispenser;

public class Dispenser {

	private Bill chain;

	public Dispenser() {

		this.chain = new Bill(100, new Bill(50, new Bill(20, new Bill(10, new Bill(5,
				new Bill(1))))));
	}

	public void withdraw(int amount) {

		chain.execute(amount);
	}
}
