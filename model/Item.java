package model;

public class Item {
	
	private String name;
	private String type;
	private int attackPower;
	private int defence;
	private int specialStats;
	private int cost;
	
	
	public Item(String name, String type, int attackPower, int defence, int specialStats, int cost) {
		this.name = name;
		this.attackPower = attackPower;
		this.defence = defence;
		this.specialStats = specialStats;
		this.type = type;
		this.cost = cost;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getType() {
		return this.type;
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
