package model;

import view.GUI;

public class Player extends LivingEntity {

//	static ArrayList<Item> playersInventory = new ArrayList<Item>();
	public static Player player;
	
	private int experience, gold,nextLevel = 10;
	private String weapon, shield, helmet, breastPlate, gauntlets, trousers, shoes, items[];
	private int healingPotions,playerMaxhealth,playerStatsPoints;
	private int playerLuck,playerPrecision,playerVitality,playerStrength,playerToughness;
	
	public Player(String name) {

		super(name, 200, 10, 10, 1);
		
		this.experience = 0;
		this.gold = 0;
		this.playerStrength = 1;
		this.playerToughness = 1;
		this.playerLuck = 1;
		this.playerPrecision = 1;
		this.healingPotions = 0;
//		this.weaponName = "Waking Stick";
//		this.weaponAP = 1;
		this.playerVitality = 1;
		this.playerMaxhealth = hp +(playerVitality *10)-10; //den här formen kan behöva ändras.
		this.playerStatsPoints = 0; //Kommer behöva ändra mängden
//		//Armor delen
//		this.boots = 1;
//		this.coat = 1;
//		this.gloves = 1;
//		this.helm = 1;
//		this.leggings = 1;
//		this.shoulders = 1;
//		this.nameBoots = "Cloth Boots";
//		this.nameCoat = "Cloth Coat";
//		this.nameGloves = "Cloth Gloves";
//		this.nameHelm = "Cloth Helm";
//		this.nameLeggings = "Cloth Leggings";
//		this.nameShoulders = "Cloth Shoulders";
//		
	}
	
	public static Player getInstance(){
		
		if (player == null){
			player = new Player("");
		}
		return player;
	}

	/**
	* Get players experience.
	* @return experience returns the experience of the player.
	*/
	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	/**
	*
	* Get players money status.
	* @return Gold returns how much coins the player have.
	 */
	public int getGold() {
		return gold;
	}
	/**
	* Changes the players money status.
	* @param gold how much is to be changed to gold.
	*/
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
	
	public int addGold(int i){
		return i;
	}
	
	public int removeGold(){
		return 0;
	}
	
	public String getItems1() {
		return "test";
	}

	/**
	* Get next level.
	* @return nextLevel returns the nextLevel value.
	*/
	public int getNextLevel() {
		return nextLevel;
	}

	public void setNextLevel(int nextLevel) {
		this.nextLevel = nextLevel;
	}
	
	/**
	* Get players strength.
	* @return playerStrength returns the strength of the player.
	*/
	public int getPlayerStrength() {
		return playerStrength;
	}
	/**
	* Changing players strength.
	* @param playerStrength sets the new playerStrength.
	*/
	public void setPlayerStrength(int playerStrength) {
		this.playerStrength = playerStrength;
	}
	/**
	* Get players toughness.
	* @return playerToughness returns the toughness of the player.
	*/
	public int getPlayerToughness() {
		return playerToughness;
	}
	/**
	* Changing players toughness.
	* @param playerToughness sets the new playerToughness.
	*/
	public void setPlayerToughness(int playerToughness) {
		this.playerToughness = playerToughness;
	}
	/**
	* Get players luck.
	* @return playerLuck returns the luck of the player.
	*/
	public int getPlayerLuck() {
		return playerLuck;
	}
	/**
	* Changing players luck.
	* @param playerLuck sets the new playerLuck.
	*/
	public void setPlayerLuck(int playerLuck) {
		this.playerLuck = playerLuck;
	}
	/**
	* Get players precision.
	* @return playerPrecision returns the precision of the player.
	*/
	public int getPlayerPrecision() {
		return playerPrecision;
	}
	/**
	* Changing players precision.
	* @param playerPrecision sets the new playerPrecision.
	*/
	public void setPlayerPrecision(int playerPrecision) {
		this.playerPrecision = playerPrecision;
	}
	/**
	* Get players vitality.
	* @return playerVitality returns the vitality of the player.
	*/
	public int getPlayerVitality() {
		return playerVitality;
	}
	/**
	* Changing players Vitality.
	* @param playerVitality sets the new playerVitality.
	*/
	public void setPlayerVitality(int playerVitality) {
		this.playerVitality = playerVitality;
	}

	/**
	* Get number of players healing.
	* @return healingPotions returns how many health potions player have left.
	*/
	public int getHealingPotions() {
		return healingPotions;
	}
	/**
	* Changing number of healing potion.
	* @param healingPotions sets the new number of amount.
	*/
	public void setHealingPotions(int healingPotions) {
		this.healingPotions = healingPotions;
	}	

	/**
	* Adding on the player's experience and check if the player has leveled up.
	* @param exp exp is the number of experience points. 
	*/
	public void Experiens(int exp){
		experience += exp;
		
		while (experience >= nextLevel) {
			int remain = experience - nextLevel;
			experience = 0;
			experience = remain;
			level++;
			nextLevel *= 2;
			hp = 200;
			GUI.printTextArea("You have levled up and are now level " + level);
			
			if (level >= 100) {
				GUI.printTextArea("You win the game!!");
				System.exit(0);
			}	
		}
	}

	/**
	* restorHealt method restore players hp, unless the player has already max hp.
	*@param healthPotain checks if player have any helthPotain left
	*/
	public void restorHealt(int healthPotain){
		String input = "n";
		healthPotain += getHealingPotions();
		do {
			if (healthPotain>0) {
				int normalHealingPotion = 20;
				if (getHp() >= getPlayerMaxhealth()) {
					setHp(playerMaxhealth);
					GUI.printTextArea("Your helth is now: "+getHp());
					break;
				}
				else {
					setHp(getHp() + normalHealingPotion);
					setHealingPotions(getHealingPotions() -1);
					if (getHp() >= getPlayerMaxhealth()) {
						setHp(playerMaxhealth);
						GUI.printTextArea("Your helth is now: "+getHp());
						break;
					}	
					GUI.printTextArea("Your helth is now: "+getHp());
				}
					
			}
			else {
				GUI.printTextArea("You dont have any potions left");
				}
			if (healthPotain>0 && getHp()<playerMaxhealth) {
				GUI.printTextArea("Do you want to use more healing potion? y/n");
				input = "";
			}
	
		} while (input.equalsIgnoreCase("y")&&healingPotions>0);
	}

	public void useItem(String itemName,int itemPoints){
		if (itemName.contains("Helmet")) {
			setNameHelm(itemName);
			setHelm(itemPoints);
		}
		else if (itemName.contains("Shoulder")) {
			setNameShoulders(itemName);
			setShoulders(itemPoints);
		}
		else if (itemName.contains("Boots")) {
			setNameBoots(itemName);
			setBoots(itemPoints);
		}
		else if (itemName.contains("Coat")) {
			setNameCoat(itemName);
			setCoat(itemPoints);
		}
		else if (itemName.contains("Leggings")) {
			setNameLeggings(itemName);
			setLeggings(itemPoints);
		}
		else if (itemName.contains("Gloves")){
			setNameGloves(itemName);
			setGloves(itemPoints);
		}
	}
	public void changePlayergear(){
		
	}
//	public void playersInventory(){
//		for (Item i : playersInventory) {
//			System.out.println(i);
//		}
//	}

public void playersStatusPoints(int statsPoints) {
		
		statsPoints += playerStatsPoints;
		while (statsPoints>0) {
			
			GUI.printTextArea("Do you want to use your " + statsPoints +" points? y/n");
			String input = "";
			if (input.equalsIgnoreCase("y")) {
				
				GUI.printTextArea("What stats do you want to incress? "
						+ "\n0: Save points for later."
						+ "\n1: Strength"
						+ "\n2: Toughness"
						+ "\n3: Precision"
						+ "\n4: Vitality"
						+ "\n5: Luck");
				int statusInput = 0;
				if (statusInput == 0) {
						playersStatusPoints(getPlayerStatsPoints() + statsPoints);
				}
				GUI.printTextArea("How many point do you want to spend? ");
				int numbers = 0;
				if (numbers > statsPoints) {
					GUI.printTextArea("You do not have that many points ");
				}
				else {
						 if(statusInput == 1){
							setPlayerStrength(numbers);
							statsPoints -= numbers; 
							}
						else if(statusInput == 2){
							setPlayerToughness(numbers);
							statsPoints -= numbers;
							}
						else if(statusInput == 3){
							setPlayerPrecision(numbers);
							statsPoints -= numbers;
							}
						else if(statusInput == 4){
							setPlayerVitality(numbers);
							statsPoints -= numbers;
							}
						else if(statusInput == 5){
							setPlayerLuck(numbers);
							statsPoints -= numbers;
							}
						else {
							setPlayerStatsPoints(getPlayerStatsPoints() + statsPoints);
							break;
						}
					}
				}
			else {
				setPlayerStatsPoints(getPlayerStatsPoints() + statsPoints);
				break;
			}
		}
	}


}



