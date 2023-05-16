package p8_Things_To_Know;

public class Point <T> {
	private T x;
	private T y;
											//Erasure occurs at compile time, 
											//The use of generics has no effect on performance during runtime
	
											//an exception class cannot be generic
	
//	private static T z;						//cannot make a static variable of T type
							
//	public Point() {
//		T t = new T();						//never use a placeholder as a constructor
//	}
	
	public Point(T x, T y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public T getX() {
		return x;
	}
	
	public void setX(T x) {
		this.x = x;
	}
	
	public T getY() {
		return y;
	}
	
	public void setY(T y) {
		this.y = y;
	}
	
//	public static void display() {
//		T val;								//a static method cannot use a generic data type
//		System.out.println();				
//	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}
