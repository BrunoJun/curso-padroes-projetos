package state.exemplo1.headphone.state;

import state.exemplo1.headphone.HeadPhone;

public class OffState implements HeadPhoneState{
    private final static HeadPhoneState instance = new OffState();

    @Override
    public void click(HeadPhone headPhone) {

        // Faz nada
    }

    @Override
    public void longClick(HeadPhone headPhone) {

        headPhone.setOn(true);
        System.out.println("Ligando...");
        headPhone.setState(PlayingState.getInstance());
    }

    public static HeadPhoneState getInstance() {

        return instance;
    }
}
