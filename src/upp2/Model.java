package upp2;

import java.util.ArrayList;
import java.util.List;

public class Model extends Observable {
    private boolean on;
    private List<Observer> observers;

    public Model() {
        on = false;
        observers = new ArrayList<>();
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this, on);
        }
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void setChanged() {
        on = !on;
        notifyObservers();
    }
}