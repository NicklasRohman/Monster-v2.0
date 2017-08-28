package view;


import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class BattleBox {

	static int answer;
	static BattleBox battleBox;
	
	
	private BattleBox() {		
	}
	
	public static BattleBox getInstance(){
		if(battleBox == null){
			battleBox = new BattleBox();
		}
		return battleBox;
	}

	public int display(String title, String message){
		Stage alertWindow = new Stage();
	
		alertWindow.initModality(Modality.APPLICATION_MODAL);
		alertWindow.setTitle(title);
		alertWindow.setMinWidth(250);
		
		Label label = new Label();
		label.setText(message);
			
		Button attackButton = new Button("attack"); 
		Button healingButton = new Button("Heal your wounds");
		Button runAwayButton = new Button("Run Away");
		
		attackButton.setOnAction(e ->{
			answer = 1;
			alertWindow.close();
			
		});
		
		healingButton.setOnAction(e ->{
			answer = 2;
			alertWindow.close();
			
		});
		
		runAwayButton.setOnAction(e ->{
			answer = 2;
			alertWindow.close();
			
		});
		
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label,attackButton,healingButton,runAwayButton);
		layout.setAlignment(Pos.CENTER);
		
		Scene scen = new Scene(layout);
		alertWindow.setScene(scen);
		alertWindow.showAndWait();
		
		return answer;
		
	}
}
