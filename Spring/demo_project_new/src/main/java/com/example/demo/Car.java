package com.example.demo;

public class Car {
	
	private String carId;
	private String carName;
	private String carColor;
	
	public Car() {
		
	}
	
	public Car(String carId, String carName, String carColor) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.carColor = carColor;
	}
	
	
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	
	

}
