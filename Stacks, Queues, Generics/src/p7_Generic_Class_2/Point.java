package p7_Generic_Class_2;

public class Point <T> {
	private T x;
	private T y;
	
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
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}
