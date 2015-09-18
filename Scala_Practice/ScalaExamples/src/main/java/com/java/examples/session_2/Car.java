package com.java.examples.session_2;

public class Car {
	private final int year;
	private int milesDriven;

	public Car(int yearOfMake) {
		year = yearOfMake;
	}

	public int getYear() {
		return year;
	}

	public int getMileDriven() {
		return milesDriven;
	}

	public void drive(int distance) {
		milesDriven += Math.abs(distance);
	}
	
	
	public static void main(String[] args) {
		Car c = new Car(2014);
		c.drive(100);
		System.out.println(c.getMileDriven());
	}
}

