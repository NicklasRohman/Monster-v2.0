package controller;

import model.Adventure;
import model.ButtonPressedEvent;
import model.EasyEnemy;
import model.Player;
import model.RandomClass;
import model.ButtonPressedListener;
import view.ConfirmBox;
import view.GUI;

/**
 * 
 * @author Nicklas The main class starts the game Its a singleton class
 */
public class GameController implements ButtonPressedListener {
	private static GUI gui;
	private Player player = Player.getInstance();
	private Battle battle = Battle.getInstance();
//	private EasyEnemy easyEnemy = new EasyEnemy(player.getLevel());

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
	 * 
	 * @param args
	 *            = null
	 */
	public static void main(String[] args) {
		GameController.getInstance();
		GameController.gui = new GUI();
		GameController.gui.startGui(args);
	}

	/**
	 * Will handle the adventure button
	 * 
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

	@Override
	public void buttonPressed(ButtonPressedEvent event) {
		System.out.println("Event triggered");
		
		switch (event.getPressedButton()) {
		case 0:
			adventureBtn();
			break;
			
		case 1:
			gui.showShop();
			break;
			
		case 2:
			gui.showInventory();
			break;
			
		case 3:
			gui.showCharacter();
			break;

		default:
				System.out.println("No index");

			break;
		}
		
	}
}