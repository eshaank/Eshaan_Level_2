import javax.swing.JFrame;
import javax.swing.Timer;

public class LeagueInvaders {
GamePanel panel;

	JFrame frame;
	int width = 500;
	int height = 800;
public static void main(String[] args) {
	  new LeagueInvaders();
	
	
	
}
LeagueInvaders(){
	panel = new GamePanel();
	 frame = new JFrame();

	 setup();
	
}
void setup(){
	frame.add(panel);
    frame.addKeyListener(panel);
	frame.setVisible(true);
	frame.setSize(width, height);
	
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
panel.startGame();

}
}
