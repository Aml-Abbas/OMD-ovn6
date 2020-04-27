package upp1;

public class Model extends Observable {
    private int state;

    public Model() {
        state=0;
    }

    public void changeState(int state) {
        this.state = state;
        setChanged();
        notifyObservers(state);
    }
}
