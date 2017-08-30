package model;

public class HardEnemy extends Enemy{
	
	public HardEnemy(int playerLevel) {
		super(RandomClass.getInt(5, 10) * (playerLevel * 10), RandomClass.getInt(5, 10) * playerLevel, RandomClass.getInt(5, 10) * playerLevel, playerLevel + 5);
	}
}
