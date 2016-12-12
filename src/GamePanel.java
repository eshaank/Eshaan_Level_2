
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Timer timer;
	Font titleFont;
	Font titleFont2;
	Rocketship rocket;

	GamePanel() {

		rocket = new Rocketship(250, 700, 50, 50);
		titleFont = new Font("Arial", Font.PLAIN, 54);
		titleFont2 = new Font("Arial", Font.PLAIN, 30);
		timer = new Timer(1000 / 60, this);
	}

	void startGame() {
		timer.start();
	}

	public void paintComponent(Graphics g) {

		if (currentState == MENU_STATE) {
			drawMenuState(g);
		}
		if (currentState == GAME_STATE) {
			drawGameState(g);
		}
		if (currentState == END_STATE) {
			drawEndState(g);
		}
	}

	void drawMenuState(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(0, 0, 500, 800);

		g.setFont(titleFont);
		g.setColor(Color.BLACK);
		g.drawString("League Invaders", 55, 200);

		g.setFont(titleFont2);
		g.setColor(Color.black);
		g.drawString("Press ENTER to Start", 100, 300);

		g.setFont(titleFont2);
		g.setColor(Color.black);
		g.drawString("Press SPACE for instructions", 55, 400);

	}

	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 500, 800);

		rocket.draw(g);
	}

	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, 500, 800);

		g.setFont(titleFont);
		g.setColor(Color.BLACK);
		g.drawString("GAME OVER", 85, 200);

		g.setFont(titleFont2);
		g.setColor(Color.BLACK);
		g.drawString("Press BACKSPACE to Restart", 50, 425);

		g.setFont(titleFont2);
		g.setColor(Color.BLACK);
		g.drawString("You killed 0 Aliens", 120, 325);
	}

	void updateMenuState() {

	}

	void updateGameState() {
		rocket.update();
	}

	void updateEndState() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();

		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();
		} else if (currentState == END_STATE) {
			updateEndState();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keyTyped");

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keyPressed");
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			currentState++;
			if (currentState > END_STATE) {
				currentState = MENU_STATE;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keyReleased");
	}
}
