package main;

public class Car implements CarInterface {
	private String name;
	private	int speed;
	private	int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public void carSpeed(String name, int speed) {
		System.out.println("car name "+name+" car speed " +speed);
	}
	public void carPrice(String name, int price) {
		System.out.println("car name " +name+" car price "+price);
}
}