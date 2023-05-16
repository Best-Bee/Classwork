package p2_Generic_Arrays;

import java.util.Arrays;
import java.util.function.Predicate;

public class Demo {

	public static void main(String[] args) {
		Bag<Book> bag = new Bag<>(Book.class, 5);
		bag.insert(new Book("A", 1.0));
		bag.insert(new Book("B", 2.2));
		bag.insert(new Book("A", 5.0));
		bag.insert(new Book("A", 7.0));
		bag.insert(new Book("E", 12.0));
		
		Bag<Student> bag2 = new Bag<>(Student.class, 5);
		bag2.insert(new Student("D", 4.0));
		bag2.insert(new Student("E", 3.3));
		bag2.insert(new Student("F", 2.8));
		
		bag.display();
		System.out.println();
		bag2.display();
		System.out.println();
		
//		Book[] bookArr = bag.search(Book.class, new Predicate<Book>() {
//			@Override
//			public boolean test(Book t) {
//				return t.getTitle().equals("A");
//			}
//		});
//		
//		Book[] bookArr2 = bag.search(Book.class, new Predicate<Book>() {
//			@Override
//			public boolean test(Book t) {
//				return t.getPrice() > 2.0;
//			}
//		});
//		
//		Book[] bookArr3 = bag.search(Book.class, new Predicate<Book>() {
//			@Override
//			public boolean test(Book t) {
//				return t.getPrice() > 2.0 && t.getTitle().equals("B");
//			}
//		});
		
		Book[] bookArr = bag.search(Book.class, t -> {
			return t.getTitle().equals("A");
		});
		
		
		Book[] bookArr2 = bag.search(Book.class, t -> {
			return t.getPrice() > 2.0;
		});
	
		Book[] bookArr3 = bag.search(Book.class, t -> {
			return t.getPrice() > 2.0 && t.getTitle().equals("B");
		});
		
		System.out.println(Arrays.toString(bookArr));
		System.out.println(Arrays.toString(bookArr2));
		System.out.println(Arrays.toString(bookArr3));
	}

}
