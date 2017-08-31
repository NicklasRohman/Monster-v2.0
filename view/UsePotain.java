package view;


import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class UsePotain {

	static boolean answer;
	static UsePotain UsePotain;
	
	private UsePotain() {		
	}
	
	public static UsePotain getInstance(){
		if(UsePotain == null){
			UsePotain = new UsePotain();
		}
		return UsePotain;
	}

	public boolean display(String message){
		Stage alertWindow = new Stage();
	
		alertWindow.initModality(Modality.APPLICATION_MODAL);
		alertWindow.setWidth(350);
		alertWindow.setHeight(200);
		alertWindow.initStyle(StageStyle.UNDECORATED);
		
		Label label = new Label();
		label.setText(message);
			
		Button yesButton = new Button("Yes"); 
		Button noButton = new Button("No");
		
		yesButton.setOnAction(e ->{
			answer = true;
			alertWindow.close();
			
		});
		
		noButton.setOnAction(e ->{
			answer = false;
			alertWindow.close();
			
		});
		
		
		
		VBox layout = new VBox(20);
		layout.getChildren().addAll(label,yesButton,noButton);
		layout.setAlignment(Pos.CENTER);
		
		Scene scen = new Scene(layout);
		alertWindow.setScene(scen);
		alertWindow.showAndWait();
		
		return answer;
		
	}
}
