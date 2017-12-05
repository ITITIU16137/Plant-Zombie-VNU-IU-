
package Characters;

public class Plants extends GameObject
{
	
	public int speed = 1;
	protected int hp;
	protected int damage;
	
	/*
	 *  Constructor 
	 */
	public Plants(int x,int y) 
	{
		super(x,y);
		
	}
	/*
	 * 	Get-Set method
	 */
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
}