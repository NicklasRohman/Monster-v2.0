package view;

import java.awt.GraphicsEnvironment;
import java.awt.event.ItemEvent;

import javax.swing.SpringLayout.Constraints;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUI extends Application{

	Button adventureButton;
	Button attackButton;
	Button inventoryButton;
	Button characterButton;
	Button shopButton;
	
	Label textarea;
	
	public GUI() {
		
	}
	
	public void startGui(String[] args){
		launch(new String[]{});
	}

		    @Override
		    public void start(Stage primaryStage) throws Exception {
		        try {
		        	
		        	adventureButton = new Button("Adventure");
		    		attackButton = new Button("Attack");
		    		inventoryButton = new Button("Inventory");
		    		characterButton = new Button("Character");
		    		shopButton = new Button("Shop");
		    		textarea = new Label();

		        GridPane pane = new GridPane();
		        pane.setStyle("-fx-background-color: #343640 ;");
		        pane.setAlignment(Pos.CENTER);
		        pane.setHgap(10);
		        pane.setVgap(10);
		        pane.setPadding(new Insets(25, 25, 25, 25));

		        ColumnConstraints col1 = new ColumnConstraints();
		        col1.setPercentWidth(5/100);
		        ColumnConstraints col2 = new ColumnConstraints();
		        col2.setPercentWidth(70/100);
		        ColumnConstraints col3 = new ColumnConstraints();
		        col2.setPercentWidth(25/100);

		        pane.getColumnConstraints().addAll(col1, col2, col3);

		        Label playerIcon = addLabel("PlayerIcon", "686B7F", 150, 150);
		        Label EnemyIcon = addLabel("EnemyIcon", "686B7F", 150, 150);

		        VBox vBoxLeft = new VBox();
		        vBoxLeft.setSpacing(300);
		        vBoxLeft.setPadding(new Insets(75, 25, 75, 25));
		        
		        vBoxLeft.getChildren().add(playerIcon);
		        vBoxLeft.getChildren().add(EnemyIcon);

		        VBox vBoxRight = new VBox();
		        vBoxRight.setSpacing(15);
		        vBoxRight.setPadding(new Insets(75, 75, 50, 25));
		        textarea.setMinSize(750, 600);
		        textarea.setMaxSize(750, 600);
		        textarea.setStyle("-fx-background-color: #FFFFFF -fx-text");
		        textarea.setAlignment(Pos.TOP_LEFT);
		        textarea.setWrapText(true);
		        pane.add(vBoxLeft, 0, 0);
		        pane.add(textarea , 1, 0);
		        pane.add(vBoxRight, 2, 0);

		        vBoxRight.getChildren().add(adventureButton);
		        adventureButton.setPrefSize(100, 40);
		        adventureButton.setStyle("-fx-background-color: #686B7F");
		        adventureButton.setOnAction(e -> textarea.setText("Adventure time \n" + textarea.getText()));
		        
		        
		        vBoxRight.getChildren().add(attackButton);
		        attackButton.setPrefSize(100, 40);
		        attackButton.setStyle("-fx-background-color: #686B7F");
		        attackButton.setOnAction(e -> textarea.setText( "Attack!!! \n" + textarea.getText()));
		        
		        vBoxRight.getChildren().add(shopButton);
		        shopButton.setPrefSize(100, 40);
		        shopButton.setStyle("-fx-background-color: #686B7F");
		        shopButton.setOnAction(e -> textarea.setText("Show me your money!!!\n" + textarea.getText()));
		        
		        vBoxRight.getChildren().add(inventoryButton);
		        inventoryButton.setPrefSize(100, 40);
		        inventoryButton.setStyle("-fx-background-color: #686B7F");
		        inventoryButton.setOnAction(e -> textarea.setText("Lets se what we have here.\n" + textarea.getText()));
		        
		        vBoxRight.getChildren().add(characterButton);
		        characterButton.setPrefSize(100, 40);
		        characterButton.setStyle("-fx-background-color: #686B7F");
		        characterButton.setOnAction(e -> textarea.setText("Thats me. :D\n" + textarea.getText()));
		        
		        
//		        vBoxRight.getChildren().add(addButton("Adventure", 100, 40, "686B7F"));
//		        vBoxRight.getChildren().add(addButton("Shop", 100, 40, "686B7F"));
//		        vBoxRight.getChildren().add(addButton("Inventory", 100, 40, "686B7F"));
//		        vBoxRight.getChildren().add(addButton("Skills", 100, 40, "686B7F"));

		        Scene scene = new Scene(pane, 1200, 800);
		        primaryStage.setScene(scene);
		        primaryStage.show();
		        }
		        catch (Exception e) {
		            e.printStackTrace();
		        }
		    }
		    
		    public Button addButton(String text, double x, double y, String color) {
		        Button btn = new Button(text);
		        btn.setStyle("-fx-background-color: #" + color + ";");
		        btn.setPrefSize(x, y);
		        
		        return btn;
		    }
		    
		    public Label addLabel(String text, String color, double x, double y) {
		        Label label = new Label(text);
		        label.setStyle("-fx-background-color: #" + color + ";");
		        label.setPrefSize(x, y);
		        return label;
		    }	
	}

	
	
	
	
	
	
//	@Override
//	public void start(Stage primaryStage) throws Exception {
//		adventureButton = new Button("Adventure");
//		attackButton = new Button("Attack");
//		inventoryButton = new Button("Inventory");
//		characterButton = new Button("Character");
//		shopButton = new Button("Shop");
//		textarea = new Label();
//		
//		textarea.setMinSize(400, 400);
//		textarea.setStyle("-fx-border-color:red; -fx-background-color: white;");
//		
//		GridPane grid = new GridPane();
//		grid.setPadding(new Insets(10,10,10,10));
//		grid.setVgap(8);
//		grid.setHgap(10);
//			
//		GridPane.setConstraints(textarea, 		 0,0,3,3);
//		GridPane.setConstraints(adventureButton, 7,3,1,1);
//		GridPane.setConstraints(attackButton, 	 7,4,1,1);
//		GridPane.setConstraints(inventoryButton, 7,5,1,1);
//		GridPane.setConstraints(characterButton, 7,6,1,1);
//		GridPane.setConstraints(shopButton, 	 7,7,1,1);
//		
//		grid.getChildren().add(adventureButton);
//		grid.getChildren().add(attackButton);
//		grid.getChildren().add(inventoryButton);
//		grid.getChildren().add(characterButton);
//		grid.getChildren().add(shopButton);
//		
//		grid.getChildren().add(textarea);
//		
//		adventureButton.setOnAction(e -> textarea.setText("Adventure time"));		
//		
//		
//		Scene scen = new Scene(grid, 1200,800);
//		primaryStage.setScene(scen);
//		primaryStage.show();
//	
//	}
	