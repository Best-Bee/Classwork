/*---------------------------------------
/
/	Author: Brendan Best
/	Date: 10/31/2021
/	Program: QuickSort sample
/	
/	Purpose: sort 100 numbers 0-99 in order
/			 and explain how to do so (comments)
/
/---------------------------------------*/

public class SampleData {
	static int numb = 0;
	
	public static void main(String[] args) {
		//declare constant variable
		final int LENGTH = 100;
		
		//create an array with the length of the constant
		int[] data = new int[LENGTH];
		
		//initialize num
		int num = 0;
		
		//for the length of the array fill it with random numbers 0 - 99
		for (int i = 0; i < LENGTH; i++) {
			num = (int) (Math.random() * 100);
			data[i] = num;
		}

		//sort all array values
		quickSort(data,0,LENGTH-1);
		
		//print out data sorted
		for (int i = 0; i < LENGTH; i++) {
			System.out.print(data[i] + " ");
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println(numb);
		
	}
	public static void quickSort(int[] arr, int start, int end) {
		/*
		 checks to make sure the start and end sorting spots are
		 not the same (basically make sure it is sortable)
		*/
		numb++;
	    if (start < end) {
	    	
	    	/*
	    	 do a sort and get the index of the end of the sorted
	    	 section
	    	*/
	        int splitNum = splitSort(arr, start, end);
	        
	        /*
	          sort the area of the string before and after the
	          sorted section but not the sorted digit
	          
	          for example:
	          
	          [1, 3, 7, 4, 9, 6, 10, 8, 2, 5]
	          
	          becomes 
	          
	          [1, 3, 4, 2, 5, 7, 9, 6, 10, 8]
	          
	          this means that the 5, must be in the right spot,
	          then you sort
	          
	          [1, 3, 4, 2] and [7, 9, 6, 10, 8]
			  
			  the 2 and the 8 then become the sorting points,
			  then split those further into
			  
			  [1, 2]
			  [3, 4]
			  
			  and
			  
			  [7, 6, 8]
			  [9, 10]
			  
			  and then sort further
	        */
	        quickSort(arr, start, splitNum-1);
	        quickSort(arr, splitNum+1, end);
	    }
	}
	private static int splitSort(int[] array, int start, int end) {
		//get a number to sort everything under and over it
	    int split = array[end];numb++;
	    
	    //set the value i 1 behind j
	    int i = (start-1);numb++;
	    
	    
	    /*
	    Take the array given and make two reference variables i and j
	    where i starts 1 behind j. if the value is lower than the threshold
	    keep it and increment j (leave i where it is), then, the next value
	    that is lower than the threshold will be swapped with the first value
	    greater than the threshold (push forward all larger values)
	    
	    for example:
	    take array     [1, 2, 9, 3, 4]
	    
	    First check:   [1, 2, 9, 3, 4]
	    Second check:  [1, 2, 9, 3, 4]
	    Third check:   [1, 2, 9, 3, 4]
	    Fourth check:  [1, 2, 3, 9, 4]
	    Fifth check:   [1, 2, 3, 4, 9]
	    
	    First I/J:     [JI,  _, _, _, _] (swap)
	    Second I/J:    [_ , JI, _, _, _] (swap)
	    Third I/J:     [_ ,  I, J, _, _] (no swap)
	    Fourth I/J:    [_ ,  _, I, J, _] (swap)
	    Fifth I/J:     [_ ,  _, _, I, J] (swap)
	    
	    
	    then, do one final change where you swap the value at the
	    end of the "sorted section" with the value at the end of the 
	    array you gave it
	    
	    then, return the value of i + 1
	    
	    */
	    for (int j = start; j < end; j++) {
	        if (array[j] <= split) {
	            i++;numb++;

	            int tempNum = array[i];numb++;
	            array[i] = array[j];numb++;
	            array[j] = tempNum;numb++;
	        }
	    }

	    int tempNum = array[i+1];numb++;
	    array[i+1] = array[end];numb++;
	    array[end] = tempNum;numb++;

	    return i+1;
	}
}
