package p2_filechooser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class DemoFileChooser extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Open Resource File");
		File initialDir = new File("rawData/");
		fileChooser.setInitialDirectory(initialDir);
		fileChooser.getExtensionFilters().addAll(new ExtensionFilter("Text Files", "*.txt"));
//				new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"),
//				new ExtensionFilter("Audio Files", "*.wav", "*.mp3", "*.aac"), 
//				new ExtensionFilter("All Files", "*.*"));
		File selectedFile = fileChooser.showOpenDialog(primaryStage);
		if (selectedFile != null) {
			BufferedReader br = new BufferedReader(new FileReader(selectedFile));
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}
	}

}