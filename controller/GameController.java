package controller;

import model.Adventure;
import model.EasyEnemy;
import model.Player;
import model.RandomClass;
import view.ConfirmBox;
import view.GUI;

public class GameController {
	static GUI gui;
	Player player = Player.getInstance();
	Battle battle = Battle.getInstance();
	EasyEnemy easyEnemy = new EasyEnemy(player.getLevel());
	public static GameController gc = null;

	private GameController() {
	}

	public static GameController getInstance() {
		if (gc == null) {
			gc = new GameController();
		}
		return gc;
	}

	public static void main(String[] args) {
		gui = new GUI();
		gui.startGui(args);
	}

	public String adventureBtn() {
		Adventure adventure = Adventure.getInstance();
		String adventureLog = adventure.goAdventuring();

		if (adventure.getAdventureWalk() >= 0) {
			ConfirmBox confrim = ConfirmBox.getInstance();
			GUI.printTextArea(adventureLog);
			if (confrim.display("You se somthing", adventureLog)) {
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
}