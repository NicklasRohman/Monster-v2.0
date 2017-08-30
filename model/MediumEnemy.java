package model;

public class MediumEnemy extends Enemy{

	public MediumEnemy(int playerLevel) {
		super(RandomClass.getInt(2, 8) * (playerLevel * 10), RandomClass.getInt(2, 8) * playerLevel, RandomClass.getInt(2, 8) * playerLevel, playerLevel + 5);
	}
}
