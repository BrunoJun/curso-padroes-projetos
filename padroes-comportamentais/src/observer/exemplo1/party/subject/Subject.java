package observer.exemplo1.party.subject;

import observer.exemplo1.party.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){

        observers.add(observer);
    }

    public void notifyObserver(boolean status){

        for (Observer o: observers) {

            o.update(status);
        }
    }
}
