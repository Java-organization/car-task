package main;

public class Main {
	public static void main(String[] args) {

		Car car = new Car();
		car.setName("bmw");
		car.setSpeed(400);
		car.setPrice(20000); 
		car.carSpeed(car.getName(), car.getSpeed());
		car.carPrice(car.getName(), car.getPrice());
		// Car car1 = new Car();
		// car1.name = "jeep";
		// car1.speed = 600;
		// car1.price = 10000;
		// car1.carSpeed(car1.name, car1.speed);
		// car1.carPrice(car1.name, car1.price);
	}

}