package main;

import javax.swing.JPanel;
import java.awt.Graphics;
import inputs.MouseInputs;
import inputs.KeyboardInputs;

public class GamePanel extends JPanel {
    private MouseInputs mouseInputs;
    private double xDelta = 100, yDelta = 100;
    private double xDir, yDir = 0.01;
    private int frames = 0;
    private long lastCheck  = 0;
    
    public GamePanel() {
        mouseInputs = new MouseInputs(this);    // gets mouse inputs
        addKeyListener(new KeyboardInputs(this));   // gets keyboard inputs
        addMouseListener(mouseInputs);          // interprets mouse button presses
        addMouseMotionListener(mouseInputs);    // interprets mouse motion
    }

    public void changeXDelta(int value) {
        this.xDelta += value;
    }

    public void changeYDelta(int value) {
        this.yDelta += value;
    }

    public void setRectPos(int x, int y) {
        this.xDelta = x;
        this.yDelta = y;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        updateRectangle();

        g.fillRect((int) xDelta, (int) yDelta, 200, 50);
        repaint();

        frames++;
        if(System.currentTimeMillis() - lastCheck >= 1000) {
            lastCheck = System.currentTimeMillis();
            System.out.println("FPS: " + frames);
            frames = 0;
        }

    }

    private void updateRectangle() {
        xDelta += xDir;
        // keep rectangle on screen
        if(xDelta > 400 || xDelta < 0) {
            xDir *= -1;
        }
        yDelta += yDir;
        if(yDelta > 400 || yDelta < 0) {
            yDir *= -1;
        }
    }
}
