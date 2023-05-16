package p1;

public class MergeApp {
	public static void main(String[] args) {
		//Big O is n because it's just merging two arrays
		int[] arrayA = {2,4,7,9,12,16,20};
		int[] arrayB = {1,4,8,9,12,19,22,30};
		int[] arrayC = new int[arrayA.length + arrayB.length];
		
		merge(arrayA, arrayA.length, arrayB, arrayB.length, arrayC);
		display(arrayC, arrayC.length);
	}

	private static void display(int[] array, int size) {
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	private static void merge(int[] arrayA, int sizeA, int[] arrayB, int sizeB, int[] arrayC) {
		int aIndex = 0;
		int bIndex = 0;
		int cIndex = 0;
		
		while(aIndex < sizeA && bIndex < sizeB) {		//neither array A nor B are finished
			if (arrayA[aIndex] < arrayB[bIndex]) {
				arrayC[cIndex++] = arrayA[aIndex++];
			} else {
				arrayC[cIndex++] = arrayB[bIndex++];
			}
		}
		
		while(aIndex < sizeA) {							//array B is finished
			arrayC[cIndex++] = arrayA[aIndex++];
		}
		
		while(bIndex < sizeB) {							//array A is finished
			arrayC[cIndex++] = arrayB[bIndex++];
		}
	}
}
