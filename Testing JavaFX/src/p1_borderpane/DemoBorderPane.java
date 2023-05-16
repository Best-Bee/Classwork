package p1_borderpane;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import model.PersonBag;

public class DemoBorderPane extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		
		MenuBar menuBar = new MenuBar();
		
		Menu fileMenu = new Menu("File");
		Menu editMenu = new Menu("Edit");
		
		MenuItem exitItem = new MenuItem("Exit");
		MenuItem importBooksItem = new MenuItem("Import Books");
		MenuItem importStudentsItem = new MenuItem("Import Students");
		MenuItem importInstructorsItem = new MenuItem("Import Instructors");
		SeparatorMenuItem separator = new SeparatorMenuItem();
		
		Menu studentMenu = new Menu("Student");
		MenuItem insertItem = new MenuItem("Insert");
		MenuItem searchItem = new MenuItem("Search");
		MenuItem removeItem = new MenuItem("Remove");
		MenuItem updateItem = new MenuItem("Update");
		studentMenu.getItems().addAll(insertItem, searchItem, removeItem, updateItem);
		Menu instructorMenu = new Menu("Instructor");
		Menu textbookMenu = new Menu("Textbook");
		
		editMenu.getItems().addAll(studentMenu, instructorMenu, textbookMenu);
		
		exitItem.setOnAction(e -> {
			Platform.exit();
		});
		
		importBooksItem.setOnAction(e -> {
//			Utilities.importBooks();
		});
		
		fileMenu.getItems().addAll(importBooksItem, importStudentsItem, importInstructorsItem, separator, exitItem);
		
		menuBar.getMenus().addAll(fileMenu, editMenu);
		
		root.setTop(menuBar);
		PersonBag personBag = new PersonBag(100);
		PersonView personView = new PersonView(personBag);
		root.setCenter(personView.getStudentPane());
		Scene scene = new Scene(root, 700, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}