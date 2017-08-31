package view;


import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ConfirmBox {

	static boolean answer;
	static ConfirmBox confirmBox;
	
	private ConfirmBox() {		
	}
	
	public static ConfirmBox getInstance(){
		if(confirmBox == null){
			confirmBox = new ConfirmBox();
		}
		return confirmBox;
	}

	public boolean display(String message){
		Stage alertWindow = new Stage();
	
		alertWindow.initModality(Modality.APPLICATION_MODAL);
		alertWindow.setWidth(450);
		alertWindow.setHeight(300);
		alertWindow.initStyle(StageStyle.UNDECORATED);
		
		Label label = new Label();
		label.setText(message);
			
		Button yesButton = new Button("Enter"); 
		Button noButton = new Button("Ignore");
		
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
