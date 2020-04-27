package upp2;

import javax.swing.*;

public class View extends JButton implements Observer {

    private Model model1;

    public View(Model model1) {
        super("OFF");
        this.model1 = model1;
        model1.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object object) {
        setLabel((boolean)object ? "ON" : "OFF");
    }

    /*public class Frame extends JFrame {
        public Frame() {
            Switch switch_ = new Switch();
            View view = new View(switch_);
            Control control = new Control(switch_, view);
            add(view);
            setVisible(true);
            pack();
        }
        public static void main(String[] args) {
            new Frame();
        }*/


    }
