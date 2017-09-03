package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.Player;

public class ShopGUI {

	static ShopGUI shopGUI;
	
	Stage shopWindow;
	
	
	public ShopGUI() {		
	}
	
	public static ShopGUI getInstance(){
		if(shopGUI == null){
			shopGUI = new ShopGUI();
		}
		return shopGUI;
	}

	public String display(String title, String message){
		
		GridPane pane = new GridPane();
		
		shopWindow = new Stage();
		shopWindow.initModality(Modality.APPLICATION_MODAL);
		shopWindow.setTitle(title);
		shopWindow.setMinWidth(500);
		shopWindow.setMinHeight(800);
		shopWindow.initStyle(StageStyle.UNDECORATED);

		
		Label label = new Label();
		label.setText(message);
			
		Button okButton = new Button("Ok"); 
		Player p = Player.getInstance();
		okButton.setOnAction(e ->{
			shopWindow.close();
			
		});
		
		VBox layout = new VBox(20);
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(label,okButton);
		layout.setAlignment(Pos.CENTER);
		
		Scene scen = new Scene(layout);
		shopWindow.setScene(scen);
		shopWindow.showAndWait();
		return p.getName();
	}
}
