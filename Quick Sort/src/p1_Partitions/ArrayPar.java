package p1_Partitions;

public class ArrayPar {
	private long[] arr;
	private int nElems;
	
	public ArrayPar(int maxSize) {
		arr = new long[maxSize];	
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
