package p2_PriorityQueueGenerics;

public class PQueue {
	private long[] queArray;
	private int nElems;
	private int maxSize;
	
	public PQueue(int maxSize) {
		this.maxSize = maxSize;
		queArray = new long[maxSize];
		nElems = 0;
	}
	
	public long remove() {
		return queArray[--nElems];
	}
	
	public long peekMin() {
		return queArray[nElems - 1];
	}
	
	public void insert(long num) {
		int j;
		if (nElems == 0) {
			queArray[0] = num;
		} else {
			for (j = nElems - 1; j >= 0; j--) {
				if (num > queArray[j]) {
					queArray[j+1] = queArray[j];
				} else {
					break;
				}
			}
			queArray[j+1] = num;
		}
		nElems++;
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
