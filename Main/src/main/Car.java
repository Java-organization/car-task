package main;

public class Car implements CarInterface {
	String name;
	int speed;
	int price;
	@Override
	public void carSpeed(String name, int speed) {
		System.out.println("car name "+name+" car speed " +speed);
	}
	public void carPrice(String name, int price) {
		System.out.println("car name " +name+" car price "+price);
}
}