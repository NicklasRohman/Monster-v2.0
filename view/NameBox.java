package view;


import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class NameBox {

	static String answer;
	static NameBox nameBox;
	
	private NameBox() {		
	}
	
	public static NameBox getInstance(){
		if(nameBox == null){
			nameBox = new NameBox();
		}
		return nameBox;
	}

	public String display(String title, String message){
		Stage alertWindow = new Stage();
	
		alertWindow.initModality(Modality.APPLICATION_MODAL);
		alertWindow.setTitle(title);
		alertWindow.setMinWidth(350);
		alertWindow.setMinHeight(200);
		
		Label label = new Label();
		label.setText(message);
			
		Button okButton = new Button("Ok"); 
		TextField nameInput  = new TextField();
		
		okButton.setOnAction(e ->{
			System.out.println(nameInput.getText());
			alertWindow.close();
			
		});
		
		VBox layout = new VBox(20);
		layout.getChildren().addAll(label,nameInput,okButton);
		layout.setAlignment(Pos.CENTER);
		
		Scene scen = new Scene(layout);
		alertWindow.setScene(scen);
		alertWindow.showAndWait();
		
		return "";
	}
}
