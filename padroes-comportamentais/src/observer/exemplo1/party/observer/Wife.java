package observer.exemplo1.party.observer;

public class Wife implements Observer{
	
	public void partyTime() {

		System.out.println("Surpresa!!!!");
	}

	@Override
	public void update(boolean status) {

		if (status){

			partyTime();
		} else {

			System.out.println("Segurem!");
		}
	}
}