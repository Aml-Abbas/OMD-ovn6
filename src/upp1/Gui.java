package upp1;

import java.awt.*;

public class Gui implements Observer{
    Model model;

    public Gui(Model model){
        this.model=model;
        model.addObserver(this);
    }
    public void showState(int state) {
    System.out.println(state);
    }

    @Override
    public void update(Observable o, Object arg) {
        showState((int) arg);
    }

    public static void main(String [] arg) {
        Model model= new Model();
        Gui gui= new Gui(model);
        model.changeState(10);
        model.changeState(15);
    }
}

