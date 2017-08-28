package model;

public abstract class Enemy extends LivingEntity{

	public Enemy(String name,int hp,int attackPower,int defence,int level) {
		super(name, hp, attackPower, defence,level);
				
	}

	public String NameGenerator(){
		
		return "";
	}
	
	
}
