package p1_simple_linked_list;

public class Link {
	private int data;
	private Book book;			//can always add more data
	private Link next;			//this doesn't need a specified amount to keep adding more, as long as you have memory you can add it
								//also, an array stores all the data in a row, a link can allocate memory scattered anywhere
								//also also, an array stores the memory at once, you can always make a linked list bigger efficiently
	public Link(int data, Book book) {		
		super();
		this.data = data;
		this.next = null;
		this.book = book;
	}

	public int getData() {
		return data;
	}
	
	public Book getBook() {
		return book;
	}

	public Link getNext() {
		return next;
	}

	public void setNext(Link next) {
		this.next = next;
	}
	
	public void setBook(Book book) {
		this.book = book;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Link [data=" + data + ", book=" + book + "]";
	}
	
}
