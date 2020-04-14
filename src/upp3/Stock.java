package upp3;

import upp2.Observable;

public class Stock extends Observable {
    private double value;

    public void update(double value){
        this.value= value;
        setChanged() ;
        notifyObservers();
    }
    public double value(){
        return value;
    }
}
