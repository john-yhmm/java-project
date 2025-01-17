package ironseige.frames;

import ironseige.panels.MainMenu;

import javax.swing.*;

public class Game extends JFrame {
    public Game() {
        add(new MainMenu());

        setTitle("Tower Def App");
        pack();
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
