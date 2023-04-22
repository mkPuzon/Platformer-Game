package inputs;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import main.GamePanel;

public class MouseInputs implements MouseListener, MouseMotionListener{
    private GamePanel gamePanel;

    public MouseInputs(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        gamePanel.spawnRect(e.getX(),e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO
    }
}
