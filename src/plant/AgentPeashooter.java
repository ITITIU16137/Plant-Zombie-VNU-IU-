package plant;

import org.newdawn.slick.*;

import characters.Plants;

public class AgentPeashooter extends Plants{
	public static String pngName="res/Agent.png";
	public static Image png;

	public AgentPeashooter(int x, int y) throws SlickException
	{
		super(x, y);
		init();
	}

	@Override
	public void init() throws SlickException
	{
		png=new Image(pngName);
	}

	@Override
	public void draw()
	{
		png.draw((float)xPos+40,(float)yPos,png.getWidth()/7,png.getHeight()/7);
	}
}
