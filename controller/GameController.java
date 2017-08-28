package controller;


import model.Adventure;
import view.ConfirmBox;
import view.GUI;

public class GameController {
	static GUI gui; 
	public static GameController gc = null; 
	private GameController() {
		
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