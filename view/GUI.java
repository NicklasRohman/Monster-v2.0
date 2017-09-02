package view;

import controller.GameController;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Player;

/**
 * 
 * @author Nicklas och Emil GUI class handles the graphics view
 */
public class GUI extends Application {
	GameController gameController = GameController.getInstance();

	Button adventureButton;
	Button attackButton;
	Button inventoryButton;
	Button characterButton;
	Button shopButton;

	Label playerIcon;
	Label spacing;
	Label enemyIcon;

	static Label playerName;
	static Label enemyName;
	static Label textarea;

	/**
	 * Starts the GUI
	 * 
	 * @param args
	 *            = null
	 */
	public void startGui(String[] args) {
		launch(new String[] {});
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
			col1.setPercentWidth(5 / 100);
			ColumnConstraints col2 = new ColumnConstraints();
			col2.setPercentWidth(70 / 100);
			ColumnConstraints col3 = new ColumnConstraints();
			col2.setPercentWidth(25 / 100);

			pane.getColumnConstraints().addAll(col1, col2, col3);
			playerIcon = addLabel("", "F03900", "686B7F", 150, 150);
			setPlayerName(addLabel("PlayerName", "F03900", "C4CAF0", 150, 40));
			spacing = addLabel("", "F03900", "343640", 150, 220);
			enemyIcon = addLabel("", "F03900", "686B7F", 150, 150);
			enemyName = addLabel("EnemyName", "F03900", "C4CAF0", 150, 40);

			this.setPlayerImage();
			this.setEnemyImage();

			VBox vBoxLeft = new VBox();
			vBoxLeft.setSpacing(20);
			vBoxLeft.setPadding(new Insets(75, 25, 75, 25));

			vBoxLeft.getChildren().addAll(playerIcon, playerName, spacing, enemyIcon, enemyName);

			VBox vBoxRight = new VBox();
			vBoxRight.setSpacing(15);
			vBoxRight.setPadding(new Insets(75, 50, 50, 25));
			textarea.setMinSize(750, 600);
			textarea.setMaxSize(750, 600);
			textarea.setStyle("-fx-background-color: #FFFFFF -fx-text");
			textarea.getStyleClass().add("textarea");
			textarea.setAlignment(Pos.TOP_LEFT);
			textarea.setWrapText(true);
			pane.add(vBoxLeft, 0, 0);
			pane.add(textarea, 1, 0);
			pane.add(vBoxRight, 2, 0);

			vBoxRight.getChildren().add(adventureButton);
			adventureButton.setPrefSize(120, 40);
			adventureButton.setStyle("-fx-text-fill: #F03900;-fx-background-color: #686B7F;");
			adventureButton.setOnAction(e ->

			gameController.adventureBtn()

			);

			vBoxRight.getChildren().add(shopButton);
			shopButton.setPrefSize(120, 40);
			shopButton.setStyle("-fx-text-fill: #F03900;-fx-background-color: #686B7F;");
			shopButton.setOnAction(e -> gameController.shopBtn());

			vBoxRight.getChildren().add(inventoryButton);
			inventoryButton.setPrefSize(120, 40);
			inventoryButton.setStyle("-fx-text-fill: #F03900;-fx-background-color: #686B7F;");
			inventoryButton.setOnAction(e -> gameController.inventoryBtn());

			vBoxRight.getChildren().add(characterButton);
			characterButton.setPrefSize(120, 40);
			characterButton.setStyle("-fx-text-fill: #F03900;-fx-background-color: #686B7F;");
			characterButton.setOnAction(e -> gameController.characterBtn());

			Scene scene = new Scene(pane, 1200, 800);
			scene.getStylesheets().add("monster.css");
			primaryStage.setScene(scene);
			primaryStage.show();
			playerName();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Set method to player
	 * 
	 * @param name
	 *            Sets the player name on the PlayerLabel
	 */
	public void setPlayerLabel(String playerName) {
		GUI.playerName.setText(playerName);
	}

	/**
	 * Set method to Enemy
	 * 
	 * @param name
	 *            Sets the Enemy name on the EnemyLabel
	 */
	public static void setEnemyLabel(String Name) {
		GUI.enemyName.setText(Name);
	}

	/**
	 * Set method to player
	 * 
	 * @param name
	 *            Sets the player name on the PlayerLabel
	 */
	public static void setPlayerName(Label name) {
		playerName = name;
	}

	/**
	 * Prints the tesxt to the textarea.
	 * 
	 * @param textToPrint
	 *            the text that are printed to the textarea
	 */
	public static void printTextArea(String textToPrint) {
		textarea.setText(textToPrint + "\n" + textarea.getText());
	}

	private Label addLabel(String text, String textColor, String color, double x, double y) {
		Label label = new Label(text);

		label.setStyle(
				"-fx-background-color: #" + color + "; -fx-text-fill: #" + textColor + "; -fx-background-radius: 3;");
		label.setPrefSize(x, y);
		return label;
	}

	private void inventory() {
		InventoryGUI inventoryGUI = new InventoryGUI();

		inventoryGUI.display("Inventory", "The inventory of the player:");
	}

	private void setPlayerImage() {
		Image image = new Image(getClass().getResourceAsStream("../baman.jpg"));
		ImageView imw = new ImageView(image);
		imw.setFitHeight(150);
		imw.setFitWidth(150);
		playerIcon.setGraphic(imw);
	}

	private void setEnemyImage() {
		Image image = new Image(getClass().getResourceAsStream("../piderman.jpg"));
		ImageView imw = new ImageView(image);
		imw.setFitHeight(150);
		imw.setFitWidth(150);
		enemyIcon.setGraphic(imw);
	}

	private void playerName() {
		NameBox nameBox = NameBox.getInstance();
		Player player = Player.getInstance();
		printTextArea("A new hero named " + nameBox.display("What will the hero name be?") + " have emerged!!");
		playerName.setText(player.getName());
	}
}