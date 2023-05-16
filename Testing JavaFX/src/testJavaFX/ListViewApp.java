package testJavaFX;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ListViewApp extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		root.setAlignment(root, Pos.CENTER);
		
		Label response = new Label("Select a college or university: ");
		Text title = new Text("NY Colleges and Universities");
		title.setFill(Paint.valueOf("#2A5058"));
		title.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		
		ArrayList<String> schoolList = new ArrayList<>();
		schoolList.add("School A");
		schoolList.add("School B");
		schoolList.add("School C");
		schoolList.add("School D");
		
		
		ListViewPane listViewPane = new ListViewPane(schoolList, response);
		ListView<String> lvColleges = listViewPane.getListView();
		
		FlowPane flowPane = new FlowPane(10, 10);
		flowPane.getChildren().addAll(title, lvColleges, response);
		
		root.setCenter(flowPane);
		root.setPadding(new Insets(50));
		Scene scene = new Scene(root, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.setOnCloseRequest(e -> {
			System.out.println("Do back up here.");
		});
		primaryStage.show();
		
	}

}