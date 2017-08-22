package model;

public abstract class LivingEntity {

	protected int hp, attackPower, defence, level;
	protected String name;
	
	public LivingEntity() {

	}

	public boolean isAlive(){
		
		if (hp>0) {
			return true;
		}
		return false;
		
	}
	
	public int reduceHealth(){
		int health = hp;
		
		return health;
		
	}
	
	public int attack(){
		
		return 0;
	}
	
	
}
