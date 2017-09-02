package controller;

import model.Adventure;
import model.EasyEnemy;
import model.Player;
import model.RandomClass;
import view.ConfirmBox;
import view.GUI;

/**
 * 
 * @author Nicklas
 * The main class starts the game
 * Its a singleton class
 */
public class GameController {
	static GUI gui;
	Player player = Player.getInstance();
	Battle battle = Battle.getInstance();
	EasyEnemy easyEnemy = new EasyEnemy(player.getLevel());
	public static GameController gc = null;

	private GameController() {
	}
	/**
	 * the method to get a instance of the class
	 */
	public static GameController getInstance() {
		if (gc == null) {
			gc = new GameController();
		}
		return gc;
	}
	/**
	 * Method that starts the game
	 * @param args = null
	 */
	public static void main(String[] args) {
		gui = new GUI();
		gui.startGui(args);
	}

	/**
	 * Will handle the adventure button
	 * @return adventureLog or ""
	 */
	public String adventureBtn() {
		Adventure adventure = Adventure.getInstance();
		String adventureLog = adventure.goAdventuring();

		if (adventure.getAdventureWalk() >= 0) {
			ConfirmBox confrim = ConfirmBox.getInstance();
			GUI.printTextArea(adventureLog);
			if (confrim.display(adventureLog)) {
				if (RandomClass.getChance(0.9)) {
					battle.battle(player, new EasyEnemy(player.getLevel()));
				} else {
					GUI.printTextArea("You found nothing");
				}
			}
			;
			return "";
		} else {
			return adventureLog;
		}

	}
	/**
	 * Will handle the shop button
	 */
	public void shopBtn(){
		GUI.printTextArea("Show me your money!!!");
		/**
		 * Will handle the inventory button
		 */
	}
	public void inventoryBtn(){
		GUI.printTextArea("Lets se what we have here.");
	}
	/**
	 * Will handle the character button
	 */
	public void characterBtn() {
		GUI.printTextArea("Thats me. :D");
	}
	
	
}