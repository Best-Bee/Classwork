package p1;

import java.util.Arrays;
import java.util.function.Predicate;

public class Demo {
	public static void main(String[] args) {
		Name name = new Name("John", "Doe");
		Car n1 = new Car("no","no",10.2,name,4);
		Car n2 = new Car(n1);
	
		Truck t1 = new Truck("yes","yes",10.2,name,true);
		Truck t2 = new Truck(t1);

		VehicleBag myBag = new VehicleBag(10);
		myBag.insert(n1);
		myBag.insert(n2);
		myBag.insert(t1);
		myBag.insert(t2);
	
//		Vehicle[] vehiclesFound = myBag.search(new Predicate<Vehicle>() {
//			@Override
//			public boolean test(Vehicle t) {
//				return t.getMake().equals("yes");
//			}
//		});
		
		Vehicle[] vehiclesFound = myBag.search((Vehicle t) -> {
			return t.getPrice() >= 30000 && t.getMake().equalsIgnoreCase("Tesla");
		});
		
		System.out.println(Arrays.toString(vehiclesFound));
		System.out.println("T1");
		
		//myBag.display();
	}
}
