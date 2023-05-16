package p2;

public interface Animal {
	void jump();
	void walk();
	void eat();
	
	//default can be inherited to child classes
	public default void show() {
		System.out.println("Show");
	}
	
	
	//static belongs to interface
	public static void drink() {
		System.out.println("Drink");
	}
}
