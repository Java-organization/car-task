package main;

public class Main {
	public static void main(String[] args) {
		
		Car car = new Car();
		car.name = "bmw";
		car.speed = 400;
		car.price = 2000;
		car.carSpeed(car.name, car.speed);
		car.carPrice(car.name, car.price);
		Car car1 = new Car();
		car1.name = "jeep";
		car1.speed = 600;
		car1.price = 10000;
		car1.carSpeed(car1.name, car1.speed);
		car1.carPrice(car1.name, car1.price);
	}
	

}