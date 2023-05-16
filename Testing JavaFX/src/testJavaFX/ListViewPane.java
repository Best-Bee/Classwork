package testJavaFX;

import java.util.ArrayList;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.SelectionMode;

public class ListViewPane {
	private String selectedString;
	private ListView<String> lvColleges;
	
	public ListViewPane(ArrayList<String> list, Label response) {
	
		ObservableList<String> schools = FXCollections.observableArrayList(list);
		
		lvColleges = new ListView<String>(schools);
		lvColleges.setPrefSize(300, 150);
		
		MultipleSelectionModel<String> lvSelModel = lvColleges.getSelectionModel();
		lvSelModel.setSelectionMode(SelectionMode.MULTIPLE);
		lvSelModel.selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> changed, String oldValue, String newValue) {
				response.setText(newValue);
			}
		});
	}
	
	public String getSelectedString() {
		return selectedString;
	}
	
	public ListView<String> getListView() {
		return lvColleges;
	}

}