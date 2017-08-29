package model;

public class Item {
	
	private int attackPower;
	private int defence;
	private int specialStats;
	private int cost;
	
	
	public Item(int attackPower, int defence, int specialStats, int cost) {
		this.attackPower = attackPower;
		this.defence = defence;
		this.specialStats = specialStats;
		this.cost = cost;
	}
	
	public int getAttackPower() {
		return this.attackPower;
	}
	
	public int getDefence() {
		return this.defence;
	}
	
	public int getSpecialStats() {
		return this.specialStats;
	}
	
	public int getCost() {
		return this.cost;
	}
}
