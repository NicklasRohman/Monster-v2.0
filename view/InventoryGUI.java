package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.Player;

public class InventoryGUI {

	static String answer;
	static InventoryGUI inventoryGUI;
	
	Stage inventoryWindow;
	
	
	public InventoryGUI() {		
	}
	
	public static InventoryGUI getInstance(){
		if(inventoryGUI == null){
			inventoryGUI = new InventoryGUI();
		}
		return inventoryGUI;
	}

	public String display(String title, String message){
		
		inventoryWindow = new Stage();
	
		inventoryWindow.initModality(Modality.APPLICATION_MODAL);
		inventoryWindow.setTitle(title);
		inventoryWindow.setMinWidth(500);
		inventoryWindow.setMinHeight(800);
		
		Label label = new Label();
		label.setText(message);
			
		Button okButton = new Button("Ok"); 
		Player p = Player.getInstance();
		okButton.setOnAction(e ->{
			inventoryWindow.close();
			
		});
		
		VBox layout = new VBox(20);
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(label,okButton);
		layout.setAlignment(Pos.CENTER);
		
		Scene scen = new Scene(layout);
		inventoryWindow.setScene(scen);
		inventoryWindow.showAndWait();
		return p.getName();
	}
}
