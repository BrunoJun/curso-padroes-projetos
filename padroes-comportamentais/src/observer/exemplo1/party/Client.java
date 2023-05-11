package observer.exemplo1.party;

import observer.exemplo1.party.observer.Friend;
import observer.exemplo1.party.subject.Doorman;
import observer.exemplo1.party.observer.Wife;

public class Client {

	public static void main(String[] args) {
		Doorman reception = new Doorman();
		Wife wife = new Wife();
		Friend friend = new Friend();

		reception.addObserver(wife);
		reception.addObserver(friend);

		reception.setStatus(false);
		reception.setStatus(true);
	}
}
