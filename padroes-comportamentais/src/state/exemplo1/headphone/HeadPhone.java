package state.exemplo1.headphone;

import state.exemplo1.headphone.state.HeadPhoneState;
import state.exemplo1.headphone.state.OffState;

public class HeadPhone {
	private boolean isOn;
	private boolean isPlaying;
	private HeadPhoneState state;
	
	public HeadPhone() {

		this.isOn = false;
		this.isPlaying = false;
		this.state = new OffState();
	}
	
	public void onLongClick() {

		System.out.println("Longo clique pressionado...");
		state.click(this);
	}
	
	public void onClick() {

		System.out.println("Clique pressionado...");
		state.longClick(this);
	}

	public boolean isOn() {

		return isOn;
	}

	public void setOn(boolean on) {

		isOn = on;
	}

	public boolean isPlaying() {

		return isPlaying;
	}

	public void setPlaying(boolean playing) {

		isPlaying = playing;
	}

	public HeadPhoneState getState() {

		return state;
	}

	public void setState(HeadPhoneState state) {

		this.state = state;
	}
}
