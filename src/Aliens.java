import java.awt.Color;
import java.awt.Graphics;

public class Aliens extends GameObject{
Aliens(int x, int y, int width, int height){
	this.x = x;
    this.y = y;
    this.height = height;
    this.width = width; 
}
void update(){
	super.update();
y++;
	}

void draw(Graphics g) {
	g.setColor(Color.RED);
	g.fillRect(x, y, width, height);
System.out.println(x + y);
}
}
