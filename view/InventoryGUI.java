package view;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.Inventory;
import model.Item;
import model.Player;

public class InventoryGUI {

	static String answer;
	static InventoryGUI inventoryGUI;
	
	private Stage inventoryWindow;
	private Label textArea;
	private Player player = Player.getInstance();
	private Inventory inventory = Inventory.getInstance();
	
	public InventoryGUI() {		
	}
	
	public static InventoryGUI getInstance(){
		if(inventoryGUI == null){
			inventoryGUI = new InventoryGUI();
		}
		return inventoryGUI;
	}

	public String display(String title, String message){
		
		GridPane pane = new GridPane();
		
		inventoryWindow = new Stage();
		inventoryWindow.initModality(Modality.APPLICATION_MODAL);
		inventoryWindow.setTitle(title);
		inventoryWindow.setMinWidth(500);
		inventoryWindow.setMinHeight(800);
		inventoryWindow.initStyle(StageStyle.UNDECORATED);

		textArea = createTextArea();

		
		Label label = new Label();
		label.setText(message);
			
		Button okButton = new Button("Ok"); 
		Player p = Player.getInstance();
		okButton.setOnAction(e ->{
			inventoryWindow.close();
			
		});


		
		VBox vBox = new VBox();
		vBox.setSpacing(20);
		vBox.setPadding(new Insets(100,150,20,150));
		vBox.getChildren().addAll(textArea, okButton);
		vBox.setAlignment(Pos.CENTER);
		
		pane.add(vBox, 0, 0);
		pane.setMinSize(500, 800);
		
		pane.getStyleClass().add("borderPane");
		
		Scene scene = new Scene(pane);
		scene.getStylesheets().add("monster.css");
		inventoryWindow.setScene(scene);
		inventoryWindow.showAndWait();
		return p.getName();
	}
	
	private Label createTextArea() {
		Label textArea = new Label();

		textArea.setMinSize(250, 400);
		textArea.setMaxSize(400, 600);
		textArea.setStyle("-fx-background-color: #FFFFFF -fx-text");
		textArea.getStyleClass().add("textarea");
		textArea.setAlignment(Pos.TOP_LEFT);
		textArea.setWrapText(true);
		textArea.setText("The Hero have the following items: ");
		for(int i = 0; i < inventory.getPlayerInventory().size(); i++) {
			Item temp = (Item)inventory.getPlayerInventory().get(i);
			textArea.setText(textArea.getText() + "\n" + (i + 1) + ": " + temp.getName());

		}

		return textArea;
	}
}
