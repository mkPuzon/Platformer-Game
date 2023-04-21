package main;

public class Game {
    // Holds Game Window and GamePanel
    private GameWindow gameWindow;
    private GamePanel gamePanel;
    
    public Game() {
        gamePanel = new GamePanel();
        gameWindow = new GameWindow(gamePanel);
        gamePanel.requestFocus(); // Allows for inputs
    }
}
