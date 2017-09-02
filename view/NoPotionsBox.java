package view;


import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/** 
 * @author Nicklas
 * Its a singleton class
 * Handles GUI for the popup window when player don't have any potions
 */
public class NoPotionsBox {

	static boolean answer;
	static NoPotionsBox confirmBox;
	
	private NoPotionsBox() {		
	}
	
	/**
	 * the method to get a instance of the class
	 */
	public static NoPotionsBox getInstance(){
		if(confirmBox == null){
			confirmBox = new NoPotionsBox();
		}
		return confirmBox;
	}
	
	/**
	 * The method display popup window
	 * @param message What it should stand on the label 
	 * @return boolean answer
	 */
	public boolean display(){
		Stage alertWindow = new Stage();
	
		alertWindow.initModality(Modality.APPLICATION_MODAL);
		alertWindow.setWidth(400);
		alertWindow.setHeight(250);
		alertWindow.initStyle(StageStyle.UNDECORATED);
		
		Label label = new Label();
		label.setText("You do not have any potions!! \nYou better run to the shop");
			
		Button yesButton = new Button("OK"); 
		
		yesButton.setOnAction(e ->{
			answer = true;
			alertWindow.close();
			
		});		
		
		
		VBox centerLayout = new VBox(10);
		centerLayout.getChildren().addAll(label);
		centerLayout.setAlignment(Pos.CENTER);
		
		HBox bottomLayout = new HBox();
		bottomLayout.getChildren().addAll(yesButton);
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
