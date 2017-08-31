package view;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

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

	public int display(String message){

		Stage alertWindow = new Stage();
		
		alertWindow.initModality(Modality.APPLICATION_MODAL);
		alertWindow.setWidth(450);
		alertWindow.setHeight(250);
		alertWindow.initStyle(StageStyle.UNDECORATED);
		
		Label label = new Label();
		label.setText(message);
		
		Button attackButton = new Button("Attack"); 
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
			answer = 3;
			alertWindow.close();
			
		});
		
		
		VBox centerLayout = new VBox(10);
		centerLayout.getChildren().addAll(label,attackButton);
		centerLayout.setAlignment(Pos.CENTER);
		
		HBox bottomLayout = new HBox();
		bottomLayout.getChildren().addAll(attackButton,healingButton,runAwayButton);
		bottomLayout.setAlignment(Pos.CENTER);
		bottomLayout.getStyleClass().add("bottomLayout");
		
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(centerLayout);
		borderPane.setBottom(bottomLayout);
		borderPane.getStyleClass().add("borderPane");
		
		Scene scen = new Scene(borderPane);
		scen.getStylesheets().add("monster.css");
		alertWindow.setScene(scen);
		alertWindow.showAndWait();

		
		return answer;
		
	}
}