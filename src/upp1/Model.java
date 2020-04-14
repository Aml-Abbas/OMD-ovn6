package upp1;

import java.util.ArrayList;
import java.util.List;

public class Model extends Observable {
    private int state;
    private List<Observer> observers;

    public Model() {
        observers = new ArrayList<>();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void notifyObservers(Object arg) {
        for (Observer o : observers) {
            o.update(this, state);
        }
    }

    protected void setChanged(int state) {
        this.state = state;
        notifyObservers(state);
    }
}
