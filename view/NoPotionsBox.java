package view;


import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class NoPotionsBox {

	static boolean answer;
	static NoPotionsBox confirmBox;
	
	private NoPotionsBox() {		
	}
	
	public static NoPotionsBox getInstance(){
		if(confirmBox == null){
			confirmBox = new NoPotionsBox();
		}
		return confirmBox;
	}

	public boolean display(){
		Stage alertWindow = new Stage();
	
		alertWindow.initModality(Modality.APPLICATION_MODAL);
		alertWindow.setWidth(300);
		alertWindow.setHeight(200);
		alertWindow.initStyle(StageStyle.UNDECORATED);
		
		Label label = new Label();
		label.setText("You do not have any potions!!, You better run to the shop");
			
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
