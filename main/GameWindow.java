package main;

import javax.swing.JFrame;

public class GameWindow {
    private JFrame jframe;

    public GameWindow(GamePanel panel) {
        
        jframe = new JFrame();

        jframe.setSize(400, 400); // Sets window width and height
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // So X in upper right corner exits program
        jframe.add(panel); // Adds game panel to the jframe
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true); // Set to true to see window
    }
    
}
