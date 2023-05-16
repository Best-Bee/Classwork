package p5_Generic_Class;

public class Demo {
	public static void main(String[] args) {
		Point<Integer, Integer> p1 = new Point<>(1, 2);
		Point<Long, Long> p2 = new Point<>(2l, 3l);			//have to put l after the number for a long
		Point<Double, Double> p3 = new Point<>(1.0, 2.0);
		Point<Integer, String> p4 = new Point<>(4, "6");	//can allow only one part to be a string
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		
		//GArray<String> a1 = new GArray<>();
	}
}
