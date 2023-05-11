package observer.exemplo1.party.subject;

public class Doorman extends Subject{
	private boolean status = false;
	
	public boolean getStatus() {

		return this.status;
	}
	
	public void setStatus(boolean newStatus) {

		if (newStatus != status){

			this.status = newStatus;
			notifyObserver(getStatus());
		}
	}
}
