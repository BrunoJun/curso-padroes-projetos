package state.exemplo1.headphone.state;

import state.exemplo1.headphone.HeadPhone;

public class PlayingState implements HeadPhoneState{

    private final static HeadPhoneState instance = new PlayingState();

    @Override
    public void click(HeadPhone headPhone) {

        headPhone.setPlaying(false);
        System.out.println("Desligando a música...");
        headPhone.setState(OnState.getInstance());
    }

    @Override
    public void longClick(HeadPhone headPhone) {

        headPhone.setOn(false);
        System.out.println("Desligando...");
        headPhone.setState(OffState.getInstance());
    }

    public static HeadPhoneState getInstance() {

        return instance;
    }
}
