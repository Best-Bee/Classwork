package p5_Generic_Class;

import java.util.Arrays;

public class GArray <E> {
	private E[] arr;

	public GArray(E[] arr) {
		super();
		this.arr = arr;
	}

	public E[] getArr() {
		return arr;
	}

	public void setArr(E[] arr) {
		this.arr = arr;
	}

	@Override
	public String toString() {
		return "GArray [arr=" + Arrays.toString(arr) + "]";
	}
	
	
}
