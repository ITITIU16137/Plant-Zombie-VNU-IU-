package javagame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Menu extends BasicGameState {
	
	public Menu (int state) {
		
	}
	public void init(GameContainer gc, StateBasedGame sbg ) throws SlickException {
		
	}
	
	public void render (GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		g.drawString("abcxyz", 50, 50);
	}
	public void update (GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		
	}
	public int getID() {
         return 0;	
	}
}
