package p1;

public class Demo {
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(5, 5.5);
		tree.insert(3, 3.3);
		tree.insert(7, 7.7);
		tree.insert(4, 4.4);
		tree.insert(6, 6.6);
		tree.insert(2, 2.2);
		tree.insert(8, 8.8);
		tree.insert(1, 1.1);
		tree.insert(9, 9.9);
		
		tree.minimum().displayNode();
		tree.maximum().displayNode();
		
		tree.find(5).displayNode();
	}
}
