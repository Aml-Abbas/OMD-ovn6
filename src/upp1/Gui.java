package upp1;

import java.awt.*;

public class Gui extends Frame implements Observer{

    public void showState(int state) {
    System.out.println(state);
    }
    @Override
    public void update(Observable o, Object arg) {
        showState((int)arg);
    }

    public static void main(String [] arg) {
        Gui gui= new Gui();
        Model model= new Model();
        model.addObserver(gui);
        model.setChanged(10);
        model.setChanged(15);
    }
}

