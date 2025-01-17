package ironseige.models;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Station extends GameObject implements ActionListener {
    private Turret turret;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (turret==null){
            // open new turret menu
        } else {
            // open upgrade/sell turret menu
            // turret type
        }
    }
}
