package s1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Dog d1 = new Dog("Dog1", 12, "Golden");
		
		Cat c1 = new Cat("Cat1", 5, "Black");
		
		Fish f1 = new Fish("Fish1", 2, 10.5, "Blue");

		PetBag myBag = new PetBag(10);
		myBag.insert(d1);
		myBag.insert(c1);
		myBag.insert(f1);
		
		myBag.display();
		
		Dog[] dogsFound = myBag.searchByBreed("Golden");
		System.out.println(Arrays.toString(dogsFound));
		
		Pet[] petsFound = myBag.searchByName("Cat1");
		System.out.println(Arrays.toString(petsFound));
	}

}
