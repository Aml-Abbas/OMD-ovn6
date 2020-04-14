package upp2;

import javax.swing.*;

public class View extends JButton implements Observer {
    private Model switch_;

    public View(Model switch_) {
        super("OFF");
        this.switch_ = switch_;
        switch_.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object object) {
        setLabel((boolean)object ? "ON" : "OFF");
    }
}
