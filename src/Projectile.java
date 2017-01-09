import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject {
	int speed;
	Projectile(int x, int y, int width, int height){
		
		 this.x = x;
		    this.y = y;
		    this.height = height;
		    this.width = width; 
		    speed = 10;
	}
	void update(){
		super.update();
		y = y- speed;
		System.out.println(y);
		if (y <= -1) {
			isAlive = false;
		}
	}
	void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x, y, width, height);
System.out.println(x + y);
	}
	
}
