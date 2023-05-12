package state.exemplo1.headphone.state;

import state.exemplo1.headphone.HeadPhone;

public class OnState implements HeadPhoneState{

    private final static HeadPhoneState instance = new OnState();

    @Override
    public void click(HeadPhone headPhone) {

        headPhone.setPlaying(true);
        System.out.println("Ligando a música...");
        headPhone.setState(PlayingState.getInstance());
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
