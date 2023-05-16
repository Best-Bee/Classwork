package p1;

public class Stacks {
	private int[] stackArr;
	private int nElems;
	private int maxSize;
	
	public Stacks(int maxSize) {
		this.maxSize = maxSize;
		stackArr = new int[maxSize];
		nElems = 0;
	}
	
	public int pop() {
		return stackArr[--nElems];
	}
	
	public int peek() {
		return stackArr[nElems - 1];
	}
	
	public void insert(int num) {
		if (nElems < maxSize) {
			stackArr[nElems++] = num;		
		} else {
			System.out.println("The stack is full!");
		}
	}
	
	public int size() {
		return nElems;
	}
	
	public boolean isFull() {
		return nElems == maxSize;
	}
	
	public boolean isEmpty() {
		return nElems == 0;
	}
}
