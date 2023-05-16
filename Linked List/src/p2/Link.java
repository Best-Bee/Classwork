package p2;

import java.util.LinkedList;

public class Link {
	private String word;
	private LinkedList<String> babyList;
	
	public Link(String word) {
		super();
		this.word = word;
		this.babyList = new LinkedList<>();
	}
	
	public LinkedList<String> getBabyList() {
		return babyList;
	}
	
	
}
