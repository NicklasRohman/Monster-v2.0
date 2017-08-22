package model;

public class player extends LivingEntity {

	private int experience, gold;
	private String weapon, shield, helmet, breastPlate, gauntlets, trousers, shoes, items[];
	
	public player() {
		
	}
	
	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public String getShield() {
		return shield;
	}

	public void setShield(String shield) {
		this.shield = shield;
	}

	public String getHelmet() {
		return helmet;
	}

	public void setHelmet(String helmet) {
		this.helmet = helmet;
	}

	public String getBreastPlate() {
		return breastPlate;
	}

	public void setBreastPlate(String breastPlate) {
		this.breastPlate = breastPlate;
	}

	public String getGauntlets() {
		return gauntlets;
	}

	public void setGauntlets(String gauntlets) {
		this.gauntlets = gauntlets;
	}

	public String getTrousers() {
		return trousers;
	}

	public void setTrousers(String trousers) {
		this.trousers = trousers;
	}

	public String getShoes() {
		return shoes;
	}

	public void setShoes(String shoes) {
		this.shoes = shoes;
	}

	public String[] getItems() {
		return items;
	}

	public void setItems(String[] items) {
		this.items = items;
	}

	public int addHealth(){
		return 0;
	}
	
	public int addExperience() {
		return 0;
	}
	
	public String addItem(){
		return "test";
	}
	
	public String removeItems(){
		return "test";
	}
	
	public int addGold(){
		return 0;
	}
	
	public int removeGold(){
		return 0;
	}
	
	public String getItems1() {
		return "test";
	}
	
}
