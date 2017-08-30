package model;

public class EasyEnemy extends Enemy{
	
	public EasyEnemy(int playerLevel) {
		super(RandomClass.getInt(10, 15) * playerLevel, RandomClass.getInt(1, 5) * playerLevel, RandomClass.getInt(1, 5) * playerLevel, RandomClass.getInt(1, 5) * playerLevel);
	}
}
