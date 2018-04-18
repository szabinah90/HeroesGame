package GUI.actionlisteners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CancelListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.exit(0);
    }
}
