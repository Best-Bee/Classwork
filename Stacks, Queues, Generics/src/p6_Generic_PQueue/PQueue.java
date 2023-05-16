package p6_Generic_PQueue;

public class PQueue <E extends Comparable<E>>{
	private E[] queArray;
	private int nElems;
	private int maxSize;
	
	public PQueue(int maxSize) {
		this.maxSize = maxSize;
		queArray = (E[]) new Object[maxSize];
		//queArray = new E[maxSize];				//cannot do this
		//queArray = new Object[maxSize];
		
		nElems = 0;
	}

	public void insert(E value) {
		int j;
		if (nElems == 0) {
			queArray[0] = value;
		} else {
			for (j = nElems - 1; j >= 0; j--) {
				if (value.compareTo(queArray[j]) > 0) {
					queArray[j+1] = queArray[j];
				} else {
					break;
				}
			}
			queArray[j+1] = value;
		}
		nElems++;
	}
	
	
	public E remove() {
		return queArray[--nElems];
	}
	
	public E peekMin() {
		return queArray[nElems - 1];
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
