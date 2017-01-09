import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	int speed;

	Rocketship(int x, int y, int height, int width) {
		speed = 5;
	    this.x = x;
	    this.y = y;
	    this.height = height;
	    this.width = width;
	}

	void update() {
		super.update();

	}

	void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
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
