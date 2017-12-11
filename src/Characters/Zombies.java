package Characters;
import org.newdawn.slick.*;
import java.util.ArrayList;

public class Zombies extends GameObject{
	private int hp=100;
	private int damage;
	public double speed=-0.09;
	public int delayTimeZom=0;
	public int maxTime=3000;
	public int delayZom=getDelayTimeZom(maxTime);//max 10s         // delay time to spawn zombies
	
	public Zombies() {}
	
	public Zombies(int x,int y)
	{
		super(x,y);
	}
	
	public int getHp()                { return hp; }
	public void setHp(int hp)         { this.hp = hp; }
	public int getDamage()            { return damage; }
	public void setDamage(int damage) { this.damage = damage;}
	public double getSpeed()          { return speed; }
	public void setSpeed(double speed){ this.speed = speed; }
	
	public void moving()
	{
		xPos+=speed;
	}
	
	public int getDelayTimeZom(int maxTime)
	{	
		return (int)(Math.random()*maxTime)+1;
	}
	
	public void draw( ArrayList<Image> zom,double i)
	{
		//use this code to RESIZE image
		zom.get((int)i).draw((int)this.xPos, (int)this.yPos, zom.get((int)i).getWidth()/3, zom.get((int)i).getHeight()/3);
	}
	
}
