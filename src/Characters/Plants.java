package Characters;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

public abstract class Plants extends GameObject{
	
	public int speed = 1;
	protected int hp;
	//protected int damage;
	
	public Plants(int x,int y) 
	{
		super();
	}
	
	public int getSpeed()                     { return speed; }
	public void setSpeed(int speed)           { this.speed = speed; }
	public int getHp()                        { return hp; }
	public void setHp(int hp)                 { this.hp = hp; }
	//public int getDamage()                    { return damage; }
	//public void setDamage(int damage)         { this.damage = damage; }
	
	//public abstract void attack();
	public abstract void render(Graphics g, Image png);
	
	
	
}
