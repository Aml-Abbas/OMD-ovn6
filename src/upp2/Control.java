package upp2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control implements ActionListener {
    Model model;

    public Control(Model model, View view) {
        this.model = model;
        view.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.setChanged();
    }


}
