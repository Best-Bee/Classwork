package p1;

public class Demo {

	public static void main(String[] args) {
		//cannot do this as it's not a complete object class
		//Animal a1 = new Animal();
		Animal s = new Student();
		s.eat();
		s.walk();
		s.jump();
		
		s.show();
		Animal.drink();

	}

}
