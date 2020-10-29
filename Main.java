/*
Properties
	• Creational design pattern
	• Used when we have too many arguments to send in Constructor and its hard to maintain the order
	• When we don’t want to send all parameters in Object initialization

Implementation
	• We create a 'static nested class', which contains all arguments of outer class
	• As per naming convention, if class name is 'Vehicle', builder class should be 'VehicleBuilder'
	• Builder class have a public constructor with all required parameters.
	• Builder class should have methods for optional parameters. Method will return the Builder object.
	• A 'build()' method that will return the final object
*/

class Main {
  public static void main(String[] args) {
    
	Vehicle car = new Vehicle.VehicleBuilder("1500cc", 4).setAirbags(4).build();

	Vehicle bike = new Vehicle.VehicleBuilder("200cc", 2).build();

	System.out.println(car.getEngine());
	System.out.println(car.getWheel());
	System.out.println(car.getAirbags());
	

	System.out.println(bike.getEngine());
	System.out.println(bike.getWheel());
	System.out.println(bike.getAirbags());
  }
}