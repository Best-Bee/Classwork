package app;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoApp extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		final int WIDTH = 70;
		final int HEIGHT = 30;
		final int BUFFER = 80;
		
		
		TextField nameField = new TextField();
		nameField.setPromptText("NAME");
		TextField gpaField = new TextField();
		gpaField.setPromptText("GPA");
		
		
		HBox inputBox = new HBox(20);
		inputBox.setAlignment(Pos.CENTER);
		inputBox.getChildren().addAll(nameField, gpaField);
		
		
		Button ok = new Button("OK");
		ok.setPrefSize(WIDTH, HEIGHT);
		Button exit = new Button("EXIT");
		exit.setPrefSize(WIDTH, HEIGHT);
		
		
		HBox buttonBox = new HBox(BUFFER); //content buffer size (space between things)
		buttonBox.setAlignment(Pos.CENTER);
		buttonBox.getChildren().addAll(ok,exit);
		
		
		VBox outputBox = new VBox(30);
		TextArea outputArea = new TextArea();
		outputArea.setMaxSize(400, 200);
		outputBox.setAlignment(Pos.CENTER);
		outputBox.getChildren().add(outputArea);
		
		VBox root = new VBox(50);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(inputBox, buttonBox, outputBox);
		
		VBox root2 = new VBox(50);
		root2.setAlignment(Pos.CENTER);
		root2.getChildren().addAll(inputBox, buttonBox);
		Scene scene = new Scene(root, 500, 500);
		Scene scene2 = new Scene(root2, 500, 500);
		
		ok.setOnAction(e -> {
			primaryStage.setScene(scene2);
		});
		
		exit.setOnAction(e -> {
			Platform.exit();
		});
		
//		Scene scene = new Scene(root, 500, 500);
//		Scene scene2 = new Scene(root2, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("My First Window");
		primaryStage.show();
	}
}
