public class Example {
	
	public static void main(String[] args) {
		final int LENGTH = 100;
		int[] data = new int[LENGTH];
		int num = 0;
		
		for (int i = 0; i < LENGTH; i++) {
			num = (int) (Math.random() * 100);
			data[i] = num;
		}
		
		display(data);
		System.out.println("\n");

		quickSort(data,0,LENGTH-1);
		
		display(data);
	}
	
	public static void quickSort(int[] arr, int start, int end) {
	    if (start < end) {
	        int splitNum = splitSort(arr, start, end);
	        quickSort(arr, start, splitNum-1);
	        quickSort(arr, splitNum+1, end);
	    }
	}
	
	private static int splitSort(int[] array, int start, int end) {
	    int split = array[end];
	    int i = (start-1);

	    for (int j = start; j < end; j++) {
	        if (array[j] <= split) {
	            i++;

	            int tempNum = array[i];
	            array[i] = array[j];
	            array[j] = tempNum;
	        }
	    }

	    int tempNum = array[i+1];
	    array[i+1] = array[end];
	    array[end] = tempNum;

	    return i+1;
	}
	
	private static void display(int[] array) {
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (j < 10) {
				System.out.print(array[i] + " ");
			} else {
				j = 0;
				System.out.print("\n" + array[i] + " ");
			}
			j++;
		}
	}
}
