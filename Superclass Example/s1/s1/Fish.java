package s1;

public class Fish extends Pet {
	
	private double length;
	private String Color;
	
	public Fish(String name, double weight, double length, String color) {
		super(name, weight);
		this.length = length;
		Color = color;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public String getColor() {
		return Color;
	}
	
	public void setColor(String color) {
		Color = color;
	}
	
	@Override
	public String toString() {
		return "Fish [" + super.toString() + ", length=" + length + ", Color=" + Color + "]";
	}


}
