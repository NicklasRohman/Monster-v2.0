package model;


/**
* @author Nicklas.
* class Player keeps track of everything that happens to the player.
*/
public abstract class LivingEntity {

	protected int hp, attackPower, defence, level;
	protected String name;
	
	public LivingEntity(String name,int hp,int attackPower,int defence,int level){
		
		this.name = name;
		this.hp = hp;
		this.attackPoints = attackPower;
		this.defence = defence;
		this.level = level;
		
		
		
	}
	
	private String weaponName = "walking stick";
	
	private int attackPoints,weaponAP,playerMaxhealth,playerStatsPoints;
	private int helm,shoulders,coat,gloves,leggings,boots,totalArmor;
	private String nameHelm,nameShoulders,nameCoat,nameGloves,nameLeggings,nameBoots;
	/**
	*Constructor for class player receives a player name.
	* @param name is the name of the player.
	*/
		
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	* Get players name.
	* @return name returns the name of the player.
	*/
	public String getName() {
		return name;
	}
	/**
	* Get players hp.
	* @return hp returns the health of the player.
	*/
	public int getHp() {
		return hp;
	}
	
	/**
	* Get players level.
	* @return level returns the level of the player.
	*/
	public int getLevel() {
		return level;
	}
	
	public int getDefence() {
		return defence;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	
	/**
	* Get players attack points.
	* @return attackPoints returns players attackPoints.
	*/
	public int getAttackPoints() {
		return attackPoints;
	}
	/**
	* Changes the player's hp.
	* @param hp sets what the new hp will be.
	*/
	public void setHp(int hp) {
		this.hp = hp;	
	}
	/**
	* Get players WeaponAP status.
	* @return weaponAP returns players weapon attack points.
	*/
	public int getWeaponAP() {
		return weaponAP;
	}
	/**
	* Changes the player's weapon attack points.
	* @param weaponAP sets how much weapon points it will be.
	*/
	public void setWeaponAP(int weaponAP){
		this.weaponAP = weaponAP;
	}
	/**
	* Get players WeaponName.
	* @return weaponName returns the name of players weapon.
	*/
	public String getWeaponName(){
		return weaponName;
	}
	/**
	* Changes the player's weapon name.
	* @param name sets the name of the weapon.
	*/
	public void setWeaponName(String name){
		this.weaponName = name;
	}
	public int getPlayerMaxhealth() {
		return playerMaxhealth;
	}

	public void setPlayerMaxhealth(int playerMaxhealth) {
		this.playerMaxhealth = playerMaxhealth;
	}

	public int getPlayerStatsPoints() {
		return playerStatsPoints;
	}

	public void setPlayerStatsPoints(int playerStatsPoints) {
		this.playerStatsPoints = playerStatsPoints;
	}

	public int getHelm() {
		return helm;
	}

	public void setHelm(int helm) {
		this.helm = helm;
	}

	public int getShoulders() {
		return shoulders;
	}

	public void setShoulders(int shoulders) {
		this.shoulders = shoulders;
	}

	public int getCoat() {
		return coat;
	}

	public void setCoat(int coat) {
		this.coat = coat;
	}

	public int getGloves() {
		return gloves;
	}

	public void setGloves(int gloves) {
		this.gloves = gloves;
	}

	public int getLeggings() {
		return leggings;
	}

	public void setLeggings(int leggings) {
		this.leggings = leggings;
	}

	public int getBoots() {
		return boots;
	}

	public void setBoots(int boots) {
		this.boots = boots;
	}

	public String getNameHelm() {
		return nameHelm;
	}

	public void setNameHelm(String nameHelm) {
		this.nameHelm = nameHelm;
	}

	public String getNameShoulders() {
		return nameShoulders;
	}

	public void setNameShoulders(String nameShoulders) {
		this.nameShoulders = nameShoulders;
	}

	public String getNameCoat() {
		return nameCoat;
	}

	public void setNameCoat(String nameCoat) {
		this.nameCoat = nameCoat;
	}

	public String getNameGloves() {
		return nameGloves;
	}

	public void setNameGloves(String nameGloves) {
		this.nameGloves = nameGloves;
	}

	public String getNameLeggings() {
		return nameLeggings;
	}

	public void setNameLeggings(String nameLeggings) {
		this.nameLeggings = nameLeggings;
	}

	public String getNameBoots() {
		return nameBoots;
	}

	public void setNameBoots(String nameBoots) {
		this.nameBoots = nameBoots;
	}

	public int getTotalArmor() {
		totalArmor = getBoots() + getCoat() + getCoat() + getGloves() + getHelm() + getLeggings(); 
		return totalArmor;
	}

	/**
	* Check if the the player's still alive.
	* @return true if the player lives, otherwise false.
	*/
	public boolean isAlive(){
		if (getHp()>0) {
			return true;
		}
		return false;
	}
		public void playersArmor(){
		
	}
	
	
	
	public int reduceHealth(){
		int health = hp;
		
		return health;
		
	}
	
	public int attack(){
		
		return 0;
	}
}

	
	
	
	
	
	
	

