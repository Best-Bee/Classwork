package p2_MergeSort;

public class MergeSortArray {
	private long[] theArray;
	private int nElems;
	
	public MergeSortArray(int maxSize) {
		theArray = new long[maxSize];
	}
	
	public void mergeSort() {
		long[] workspace = new long[nElems];
		recMergeSort(workspace, 0, nElems - 1);
	}

	private void recMergeSort(long[] workspace, int lowerBound, int upperBound) {
		if(lowerBound == upperBound) {
			return;
		} else {
			int mid = (lowerBound + upperBound) / 2;
			recMergeSort(workspace, lowerBound, mid);		//sort lower half
			recMergeSort(workspace, mid+1, upperBound);		//sort upper half
			merge(workspace, lowerBound, mid+1, upperBound);
		}
	}

	private void merge(long[] workspace, int lowPointer, int highPointer, int upperBound) {
		int j = 0;								//workspace index
		int lowerBound = lowPointer;		
		int mid = highPointer - 1;
		int n = upperBound - lowerBound + 1;	//number of data items
		
		while(lowPointer <= mid && highPointer <= upperBound) {
			if (theArray[lowPointer] <= theArray[highPointer]) {
				workspace[j++] = theArray[lowPointer++];
			} else {
				workspace[j++] = theArray[highPointer++];
			}
		}
		
		while (lowPointer <= mid) {				//high half is done
			workspace[j++] = theArray[lowPointer++];
		}
		
		while (highPointer <= upperBound) {		//low half is done
			workspace[j++] = theArray[highPointer++];
		}
		
		for (j = 0; j < n; j++) {
			theArray[lowerBound + j] = workspace[j];
		}
	}
	
	public void insert(long val) {
		theArray[nElems++] = val;
	}
	
	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(theArray[i] + " ");
		}
		System.out.println();
	}
}
