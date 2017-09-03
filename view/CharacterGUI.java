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

public class CharacterGUI {

	static CharacterGUI characterGUI;
	
	private Player player = Player.getInstance();
	private Stage characterWindow;
	private Label textArea;
	
	public CharacterGUI() {		
	}
	
	public static CharacterGUI getInstance(){
		if(characterGUI == null){
			characterGUI = new CharacterGUI();
		}
		return characterGUI;
	}

	public String display(String title, String message){
		
		GridPane pane = new GridPane();
		
		characterWindow = new Stage();
		characterWindow.initModality(Modality.APPLICATION_MODAL);
		characterWindow.setTitle(title);
		characterWindow.setMinWidth(500);
		characterWindow.setMinHeight(800);
		characterWindow.initStyle(StageStyle.UNDECORATED);

		textArea = createTextArea();

		
		Label label = new Label();
		label.setText(message);
			
		Button okButton = new Button("Ok"); 
		Player p = Player.getInstance();
		okButton.setOnAction(e ->{
			characterWindow.close();
			
		});


		
		VBox vBox = new VBox();
		vBox.setSpacing(20);
		vBox.setPadding(new Insets(100,150,20,150));
		vBox.getChildren().addAll(textArea, okButton);
		vBox.setAlignment(Pos.CENTER);
		
		pane.add(vBox, 0, 0);
		pane.setMinSize(500, 800);
		
		pane.getStyleClass().add("borderPane");
		
		Scene scene = new Scene(pane);
		scene.getStylesheets().add("monster.css");
		characterWindow.setScene(scene);
		characterWindow.showAndWait();
		return p.getName();
	}
	
	private Label createTextArea() {
		Label textArea = new Label();

		textArea.setMinSize(250, 400);
		textArea.setMaxSize(400, 600);
		textArea.setStyle("-fx-background-color: #FFFFFF -fx-text");
		textArea.getStyleClass().add("textarea");
		textArea.setAlignment(Pos.TOP_LEFT);
		textArea.setWrapText(true);
		
		textArea.setText(" Healtpoints: " + player.getHp() + "\n Attack power: " + player.getAttackPoints() + "\n Defence: " + player.getDefence() + "\n Luck: " + player.getPlayerLuck() + "\n Level: " + player.getLevel() + "\n Gold: " + player.getGold());

		return textArea;
	}
}
