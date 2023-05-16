package p1_simple_linked_list;

public class LinkedList {
	private Link first;
	private int count;

	public LinkedList() {
		super();
		this.first = null;
		count = 0;
	}
	
	public Link remove() {
		Link temp = first;
		first = first.getNext();			//I believe this is a memory leak because it never clears the old memory it used
		count--;
		return temp;
	}
	
	public void insert(Link newLink) {
		if(first == null) {
			first = newLink;
		} else {
			newLink.setNext(first);
			first = newLink;
		}
		count++;
	}
	
	public void displayList() {
		System.out.println("First Link --> Last Link");
		Link current = first;
		while(current != null) {
			System.out.println(current.toString());
			current = current.getNext();
		}
		
	}
	
	public int listLength() {
		return count;
	}
	
}
