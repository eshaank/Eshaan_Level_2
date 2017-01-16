import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {
	
	public GameObject() {
collisionBox.setBounds(x, y, width, height);
	}

	int x;
	int y;
	int width;
	int height;
    boolean isAlive = true;
    Rectangle collisionBox = new Rectangle();
	void update() {
collisionBox.setBounds(x, y, width, height);
	}

	void draw(Graphics g) {

	}

}
