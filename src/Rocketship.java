import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	int speed;

	Rocketship(int x, int y, int height, int width) {
		super();
		speed = 7;
	    this.x = x;
	    this.y = y;
	    this.height = height;
	    this.width = width;
	}

	void update() {
		super.update();
		

	}

	void draw(Graphics g) {
		g.drawImage(GamePanel.rocketImg, x, y, width, height, null);

System.out.println(x + y);
	}
	void right(){
		x = x + speed;
		
		System.out.println(x);
	}
	void left(){
		x = x - speed;
	}
	void up(){
		y = y - speed;
	}
	void down(){
		y = y + speed;
	}
}
