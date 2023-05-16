package p1;

public class Tree {
	private Node root;
	
	public Tree() {
		root = null;
	}
	
	public void insert(int iData, double dData) {
		Node newNode = new Node();
		newNode.iData = iData;
		newNode.dData = dData;
		
		if(root == null) {
			root = newNode;
		} else {
			Node current = root;
			Node parent;
			while(true) {
				parent = current;
				if(iData < current.iData) {
					current = current.leftChild;
					if(current == null) {
						parent.leftChild = newNode;
						return;
					}
				} else {
					current = current.rightChild;
					if (current == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	
	public Node minimum() {
		Node current;
		Node last = null;
		current = root;
		
		while (current != null) {
			last = current;
			current = current.leftChild;
		}
		return last;
	}
	
	public Node maximum() {
		Node current;
		Node last = null;
		current = root;
		
		while (current != null) {
			last = current;
			current = current.rightChild;
		}
		return last;
	}
	
	public Node find(int key) {
		Node current;
		current = root;
	
		while(current.iData != key) {
			if (key < current.iData) {
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}
			
			if (current == null) {
				return null;
			}
		}
		return current;
	}
	
	public boolean delete(int key) {
		Node current = root;
		Node parent = root;
		boolean isLeftChild = true;
		
		while(current.iData != key) {
			parent = current;
			if(key < current.iData) { 	// go left
				isLeftChild = true;
				current = current.leftChild;
			} else {					// go right
				isLeftChild = false;
				current = current.rightChild;
			}
			
			if(current == null) {
				return false;
			}
		}
		
		// current is node to be deleted
		// case 1: current node has no children
		if (current.leftChild == null && current.rightChild == null) {	// current has no children
			if (current == root) {
				root = null; 					// tree is now empty
			} else if (isLeftChild) { 			// current is left child of parent
				parent.leftChild = null; 		// parent lost left child
			} else {
				parent.rightChild = null;		// parent lost right child
			}
		}
		
		// case 2: current has one child
		else if (current.rightChild == null) {
			if (current == root) {
				root = current.leftChild;
			} else if (isLeftChild) {
				parent.leftChild = current.leftChild;
			} else {
				parent.rightChild = current.leftChild;
			}
		} else if (current.leftChild == null) {
			if (current == root) {
				root = current.rightChild;
			} else if (isLeftChild) {
				parent.leftChild = current.rightChild;
			} else {
				parent.rightChild = current.rightChild;
			}
		}
		
		// case 3: current has two children (I hate when parents have two children)
		else {
			// get successor
			Node successor = getSuccessor(current);
			if (current == root) {
				root = successor;
			} else if (isLeftChild) {
				parent.leftChild = successor;
			} else {
				parent.rightChild = successor;
			}
			successor.leftChild = current.leftChild;
		}
		return true;
	}

	public Node getSuccessor(Node delNode) {	
		Node successorParent = delNode;
		Node successor = delNode;
		Node current = delNode.rightChild;		// go to right child
		while (current != null) {				// until no more left children
			successorParent = successor;
			successor = current;
			current = current.leftChild;		// go to left child
		}
		
		if (successor != delNode.rightChild) {						// if successor not right
																	// make connections
			successorParent.leftChild = successor.rightChild;		
			successor.rightChild = delNode.rightChild;
		}
		
		return successor;
	}
	
	public void traverse(int traverseType) {
		switch (traverseType) {
		case 1:
			System.out.println("\nPreorder Traversal: ");
			preOrder(root);
			break;
		case 2:
			System.out.println("\nInorder Traversal: ");
			inOrder(root);
			break;
		case 3:
			System.out.println("\nPorstorder Traversal: ");
			postOrder(root);
			break;
		}
		System.out.println();
	}
	
	public void preOrder(Node localRoot) {
		if (localRoot != null) {
			System.out.print(localRoot.iData + " ");
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
		}
	}
	
	public void inOrder(Node localRoot) {
		if (localRoot != null) {
			inOrder(localRoot.leftChild);
			System.out.print(localRoot.iData + " ");
			inOrder(localRoot.rightChild);
		}
	}
	
	public void postOrder(Node localRoot) {
		if (localRoot != null) {
			postOrder(localRoot.leftChild);
			postOrder(localRoot.rightChild);
			System.out.print(localRoot.iData + " ");
		}
	}
	
	public void displayTree() {
		
	}
}
