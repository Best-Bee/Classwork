package p3_anonymous_class;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("Adam", 3.5, new Playable() {
			@Override
			public void play() {
				System.out.println("Play Basketball");
			}
		});
		Student s2 = new Student("John", 3.5, new Playable() {
			@Override
			public void play() {
				System.out.println("Play Soccer");
			}
		});
		s1.playSports();
		s2.playSports();
	}
}
