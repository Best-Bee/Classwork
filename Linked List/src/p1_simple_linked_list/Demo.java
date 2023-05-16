package p1_simple_linked_list;

public class Demo {
	public static void main(String[] args) {
		Link link1 = new Link(10, new Book("A", 1.0));
		Link link2 = new Link(20, new Book("B", 12.0));
		Link link3 = new Link(30, new Book("C", 10.0));
		Link link4 = new Link(40, new Book("D", 7.0));
		
		LinkedList linkedList = new LinkedList();
		System.out.println(linkedList.listLength());
		linkedList.insert(link1);
		linkedList.insert(link2);
		linkedList.insert(link3);
		linkedList.insert(link4);
		System.out.println(linkedList.listLength());
		
		linkedList.displayList();					//always shows in reverse because you have to put them in a stack-like order
		
		System.out.println();
		System.out.println(linkedList.listLength());
		System.out.println(linkedList.remove());
		System.out.println(linkedList.listLength());
		System.out.println(linkedList.remove());
		System.out.println(linkedList.listLength());
		System.out.println(linkedList.remove());
		System.out.println(linkedList.listLength());
		System.out.println(linkedList.remove());
		System.out.println(linkedList.listLength());
	}
}
