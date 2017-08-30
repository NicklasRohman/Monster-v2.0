package view;


import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class DeadBox {

	static boolean answer;
	static DeadBox confirmBox;
	
	private DeadBox() {		
	}
	
	public static DeadBox getInstance(){
		if(confirmBox == null){
			confirmBox = new DeadBox();
		}
		return confirmBox;
	}

	public boolean display(){
		Stage alertWindow = new Stage();
	
		alertWindow.initModality(Modality.APPLICATION_MODAL);
		alertWindow.setTitle("Dead Man Walking");
		alertWindow.setMinWidth(350);
		alertWindow.setMinHeight(200);
		
		Label label = new Label();
		label.setText("You do not have any potions, so You are DEAD!!!");
			
		Button yesButton = new Button("OK"); 
		
		yesButton.setOnAction(e ->{
			answer = true;
			alertWindow.close();
			
		});		
		
		
		VBox layout = new VBox(20);
		layout.getChildren().addAll(label,yesButton);
		layout.setAlignment(Pos.CENTER);
		
		Scene scen = new Scene(layout);
		alertWindow.setScene(scen);
		alertWindow.showAndWait();
		
		return answer;
		
	}
}
