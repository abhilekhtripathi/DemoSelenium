package abstractLogic;

//Abstract class
abstract class Vehicle {
 
 // Abstract method (does not have a body)
 abstract void startEngine();

 // Non-abstract method (has a body)
 void stopEngine() {
     System.out.println("Engine is stopping...");
 }
}

//Concrete subclass
class Car extends Vehicle {

 // Implementing the abstract method
 @Override
 void startEngine() {
     System.out.println("Car engine is starting...");
 }
}

//Main class to test
public class AbstractLogic {
 public static void main(String[] args) {
     Car myCar = new Car();
     myCar.startEngine();  // Calls implemented method
     myCar.stopEngine();   // Calls inherited method
 }
}
