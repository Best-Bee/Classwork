package model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.function.Predicate;

public class TextbookBag implements Serializable{
	private Textbook[] arr;
	private int nElems;
	
	public TextbookBag(int maxSize) {
		arr = new Textbook[maxSize];
	}
	
	public void insert(Textbook textbook) {
		arr[nElems++] = textbook;
	}
	
	public Textbook[] search(Predicate<Textbook> predicate) {
		Textbook[] temp = new Textbook[nElems];
		int count = 0;
		for (int i = 0; i < nElems; i++) {
			if(predicate.test(arr[i])) {
				temp[count++] = arr[i];
			}
		}
		return Arrays.copyOf(temp, count);
	}
	
	public Textbook[] delete(Predicate<Textbook> predicate) {
		Textbook[] temp = new Textbook[nElems];
		int count = 0;
		for (int i = 0; i < nElems; i++) {
			if(!(predicate.test(arr[i]))) {
				temp[count++] = arr[i];
			}
		}
		return Arrays.copyOf(temp, count);
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
	
	public int getnElems() {
		return nElems;
	}
}
