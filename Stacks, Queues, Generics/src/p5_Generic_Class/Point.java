package p5_Generic_Class;

public class Point <T extends Number, S> {
//	private double x;	//can do this but thats only doubles
//	private double y;
	
	private T x;
	private S y;
	
	public Point(T x, S y) {
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
	
	public S getY() {
		return y;
	}
	public void setY(S y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}
