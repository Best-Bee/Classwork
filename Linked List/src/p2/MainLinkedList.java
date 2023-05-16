package p2;

import java.util.LinkedList;

public class MainLinkedList {
	private LinkedList<Link> mainList;
	public MainLinkedList() {
		super();
		this.mainList = new LinkedList<>();
	}
	public void add(String word) {
		Link newLink = new Link(word);
		mainList.add(newLink);
	}
//	public Link search(String word) {
//		while() {
//			
//		}
//	}
}