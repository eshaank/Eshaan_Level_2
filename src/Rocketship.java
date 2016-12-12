import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	int speed;

	Rocketship(int x, int y, int height, int width) {
		speed = 5;
	}

	void update() {
speed++;
	}

	void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(250, 700, 50, 50);

	}
}
