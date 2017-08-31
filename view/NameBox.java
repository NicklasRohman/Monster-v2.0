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
import javafx.stage.StageStyle;
import model.Player;

public class NameBox {

	static String answer;
	static NameBox nameBox;
	
	Stage alertWindow;
	
	
	private NameBox() {		
	}
	
	public static NameBox getInstance(){
		if(nameBox == null){
			nameBox = new NameBox();
		}
		return nameBox;
	}

	public String display(String message){
		
		alertWindow = new Stage();
	
		alertWindow.initModality(Modality.APPLICATION_MODAL);
		alertWindow.setHeight(300);
		alertWindow.setWidth(400);
		alertWindow.initStyle(StageStyle.UNDECORATED);
		
		Label label = new Label();
		label.setText(message);
			
		Button okButton = new Button("Ok"); 
		TextField nameInput  = new TextField();
		Player p = Player.getInstance();
		okButton.setOnAction(e ->{
			
			p.setName(nameInput.getText());
			alertWindow.close();
			
		});
		
		VBox layout = new VBox(20);
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(label,nameInput,okButton);
		layout.setAlignment(Pos.CENTER);
		
		Scene scen = new Scene(layout);
		alertWindow.setScene(scen);
		alertWindow.showAndWait();
		return p.getName();
	}
}
