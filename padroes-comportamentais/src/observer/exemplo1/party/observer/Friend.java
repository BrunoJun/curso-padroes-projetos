package observer.exemplo1.party.observer;

public class Friend implements Observer{

    public void sendGift(){

        System.out.println("Toma sua bicicleta!!!");
    }

    @Override
    public void update(boolean status) {

        if (status){

            sendGift();
        } else {

            System.out.println("Ainda não chegou.");
        }
    }
}
