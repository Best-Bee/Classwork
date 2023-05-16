package p3_savefiles;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class DemoSaveFiles extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
//		ImageView imgView = new ImageView("UIControls/Save.jpg");
//		imgView.setFitWidth(20);
//		imgView.setFitHeight(20);
//		Menu file = new Menu("File");
//		MenuItem item = new MenuItem("Save", imgView);
//		file.getItems().addAll(item);
//		// Creating a File chooser
//		FileChooser fileChooser = new FileChooser();
//		fileChooser.setTitle("Save");
//		fileChooser.getExtensionFilters().addAll(new ExtensionFilter("All Files", "*.*"));
//		// Adding action on the menu item
//		item.setOnAction(new EventHandler<ActionEvent>() {
//			public void handle(ActionEvent event) {
//				// Opening a dialog box
//				fileChooser.showSaveDialog(primaryStage);
//			}
//		});
		// Creating a menu bar and adding menu to it.
		//MenuBar menuBar = new MenuBar(file);
		//Group root = new Group(menuBar);
		VBox root = new VBox(50);
		Scene scene = new Scene(root, 595, 355, Color.rgb(20, 20, 20));
		primaryStage.setTitle("File Chooser Example");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}