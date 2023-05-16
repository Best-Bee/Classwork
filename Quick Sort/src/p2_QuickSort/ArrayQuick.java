package p2_QuickSort;

public class ArrayQuick {
	private long[] arr;
	private int nElems;
	
	public ArrayQuick(int maxSize) {
		arr = new long[maxSize];
	}
	
	public void quickSort () {
		recQuickSort(0, nElems - 1);
	}
	
	public void recQuickSort(int left, int right) {
		if (left >= right) {
			return;
		} else {
			long pivot = arr[right];
			int partition = partitionIt(left, right, pivot);
			recQuickSort(left, partition - 1);
			recQuickSort(partition + 1, right);
		}
	}
	
	public int partitionIt(int left, int right, long pivot) {
		int LP = left - 1;		//left pointer
		int RP = right + 1;		//right pointer
		
		while(true) {
			while (LP < right && arr[++LP] < pivot) {}	//find first val of left that is on the wrong side
			while (RP > left && arr[--RP] >= pivot) {}	//find first val of right that is on the wrong side
			if(LP >= RP) {
				break;
			} else {
				swap(LP, RP);
			}
		}
		swap(LP, right);
		return LP;	//location of the partition (the last partition)
	}

	private void swap(int LP, int RP) {
		long temp = arr[RP];
		arr[RP] = arr[LP];
		arr[LP] = temp;
	}
	
	public void insert(long value) {
		arr[nElems++] = value;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	
}
