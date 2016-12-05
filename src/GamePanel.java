
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
	GameObject object;

	GamePanel() {

		object = new GameObject();
		titleFont = new Font("Arial", Font.PLAIN, 54);
		titleFont2 = new Font("Arial", Font.PLAIN, 30);
		timer = new Timer(1000 / 60, this);
	}

	void startGame() {
		timer.start();
	}

	public void paintComponent(Graphics g) {
		object.draw(g);
		if (currentState == MENU_STATE) {
			paintMenuState(g);
		}
		if (currentState == GAME_STATE) {
			paintGameState(g);
		}
		if (currentState == END_STATE) {
			paintEndState(g);
		}
	}

	void paintMenuState(Graphics g) {
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

	void paintGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 500, 800);
	}

	void paintEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, 500, 800);
		g.setFont(titleFont);
		g.setColor(Color.BLACK);
		g.drawString("GAME OVER", 55, 200);
	}

	void updateMenuState() {

	}

	void updateGameState() {

	}

	void updateEndState() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		object.update();
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
		if (currentState == END_STATE) {
			currentState = MENU_STATE;
		} else if (currentState == MENU_STATE) {
			currentState = GAME_STATE;
		} else if (currentState == GAME_STATE) {
			currentState = END_STATE;
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keyPressed");

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keyReleased");
	}
}
