package Plants;

import java.util.ArrayList;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

import Characters.*;
import Event.Physic;
import GUI.Main;
import Interface.Characters;

public class TripletPeashooter extends Plants implements Characters{
	private ArrayList<Bullet> bullets=new ArrayList<>();
	private ArrayList<Zombies> zombies=new ArrayList<>();
	Physic phy =new Physic();
	Bullet tempBullet;
	Main screen;
	Graphics g;
	Image png;
	
	public TripletPeashooter(int x, int y)   {super(x, y);}
	
	@Override
	public void attack()                        
	{
		for(int i=0;i<bullets.size();i++)                     //shoot all the bullets in the list
		{
			tempBullet=bullets.get(i);
			
			if(tempBullet.xPos>screen.WIDTH)                  // remove bullets out of screen
			{
				remove(tempBullet);
			}
			
			if(phy.Collision(tempBullet, zombies))
			{
				remove(tempBullet);
			}
			tempBullet.flying();
		}
	}
	
	@Override
	public void render(Graphics g,Image png) {                // draw bullets
		for(int i=0;i<bullets.size();i++)
		{
			tempBullet=bullets.get(i);
			tempBullet.render(g,png);
		}
	}
	
	@Override
	public void add(Bullet b) {					              //add Bullets
		bullets.add(b);
	}
	
	@Override
	public void remove(Bullet b) {				             //remove Bullets out of screen
		bullets.remove(b);
	}
}
