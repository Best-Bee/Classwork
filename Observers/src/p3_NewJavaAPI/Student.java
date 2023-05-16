package p3_NewJavaAPI;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Student {
	private Record record;
	private PropertyChangeSupport support;
	
	public Student() {
		support = new PropertyChangeSupport(this);
	}
	
	public void addPropertyChangeListener(PropertyChangeListener pcl) {
		support.addPropertyChangeListener(pcl);
	}
	
	public void removePropertyChangeListener(PropertyChangeListener pcl) {
		support.removePropertyChangeListener(pcl);
	}
	
	public void setRecord(Record record) {
		Record oldRecord = this.record;
		this.record = record;
		support.firePropertyChange("Record 1", oldRecord, record);
	}
	
}
