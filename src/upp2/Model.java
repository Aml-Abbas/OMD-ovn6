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

    public void toggle(){
        on=!on;
        setChanged();
        notifyObservers(on);
    }

    public boolean isOn(){
        return on;
    }

}