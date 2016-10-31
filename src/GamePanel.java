

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
	final int MENU_STATE = 0;
    final int GAME_STATE = 1;
    final int END_STATE = 2;
    int currentState = MENU_STATE;
Timer timer;
GameObject object = new GameObject();
GamePanel(){
	timer = new Timer(1000/60, this);
}
void startGame(){
	timer.start();
}
public void paintComponent(Graphics g){
object.draw(g);
}
void updateMenuState(){

}
void updateGameState(){
	
}
void updateEndState(){
	
}

@Override
public void actionPerformed(ActionEvent e) {
repaint();
object.update();
if(currentState == MENU_STATE){
updateMenuState();
}
else if(currentState == GAME_STATE){
updateGameState();
}
else if(currentState == END_STATE){
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
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
System.out.println("keyReleased");
}
}
