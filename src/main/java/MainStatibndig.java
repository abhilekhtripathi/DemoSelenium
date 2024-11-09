

class Vehicle {
	// Static method
	static void display() {
		System.out.println("This is a vehicle.");
	}
}

 class Car extends Vehicle {
	// Static method
	 static  void display() {
		System.out.println("This is a car.");
	}
}

public class MainStatibndig {
	public static void main(String[] args) {
		Vehicle myVehicle = new Car();
		myVehicle.display(); // Calls Vehicle's display() due to static binding
	}
}
//Static Methods: Both Vehicle and Car have a static method named display().
//Static Binding: When myVehicle.display() is called, it refers to the Vehicle class’s display() method
//because static binding occurs at compile time, based on the reference type (Vehicle), not the actual object type (Car).

//Static binding (also known as early binding) occurs when the method to be executed is determined at compile time. 
//This typically happens with static methods, final methods, and private methods.