package p3_NewJavaAPI;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class StudentListener implements PropertyChangeListener{
	private Record record;

	public void propertyChange(PropertyChangeEvent event) {
		System.out.println(event.getPropertyName());
		this.setRecord((Record) event.getNewValue());
	}

	private void setRecord(Record record) {
		this.record = record;
	}
	
	public Record getRecord() {
		return record;
	}
}
