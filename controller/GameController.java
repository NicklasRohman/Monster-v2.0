package controller;


import model.Adventure;
import model.EasyEnemy;
import model.Enemy;
import view.ConfirmBox;
import view.GUI;
import view.NameBox;

public class GameController {
	static GUI gui; 
	public static GameController gc = null; 
	
	private Enemy enemy01;
	private Enemy enemy02;
	private Enemy enemy03;
	private Enemy enemy04;
	
	
	private GameController() {
		enemy01 = new EasyEnemy(0, 0, 0, 0);
		enemy02 = new EasyEnemy(0, 0, 0, 0);
		enemy03 = new EasyEnemy(0, 0, 0, 0);
		enemy04 = new EasyEnemy(0, 0, 0, 0);
		
	}
	
	public static GameController getInstance(){
		if(gc == null){
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
		
		if (adventure.getAdventureWalk() >= 0){
			ConfirmBox confrim = ConfirmBox.getInstance();
			GUI.printTextArea(adventureLog);
			if(confrim.display("You se somthing", adventureLog)){
				
			};
			return "";
		}
		else {
			return adventureLog;
		}
		
	}
	}