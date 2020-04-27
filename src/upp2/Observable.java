package upp2;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private List<Observer> observers = new ArrayList<>();


    public void addObserver(Observer o){
        observers.add(o);

    }
    public void notifyObservers(Object arg){
        for (Observer o : observers) {
            o.update(this, arg);
        }
    }
    protected void setChanged(){

    }
}
