package p3_Bin_Search;

public class Demo {									//binary search via recursion
	public static void main(String[] args) {
		int[] numbers = {1,3,6,9,23,34,67,89,98};	//has to be sorted
		int indexFound = binarySearch(numbers, 0, numbers.length - 1, 34);
		System.out.println(indexFound);
	}

	private static int binarySearch(int[] arr, int first, int last, int key) {
		int middle;
		if(first > last) {
			return -1;
		}
		middle = (first + last) / 2;
		if(arr[middle] == key) {
			return middle;
		} else if (arr[middle] < key) {
			return binarySearch(arr, middle + 1, last, key);
		} else {
			return binarySearch(arr, first, middle - 1, key);
		}
	}
}
