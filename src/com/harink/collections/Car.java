package com.harink.collections;

import java.util.Objects;

public class Car implements Comparable<Car>{
	private String make;
	private String models;
	private int year;
	private int price;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String make, String models, int year, int price) {
		super();
		this.make = make;
		this.models = models;
		this.year = year;
		this.price = price;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModels() {
		return models;
	}
	public void setModels(String models) {
		this.models = models;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [make=" + make + ", models=" + models + ", year=" + year + ", price=" + price + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(make,models);

	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
		return true;
		if(obj==null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		
		
		Car c2=(Car)obj;
		return this.make==c2.make && this.models==c2.models;
	}
	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		int result=this.make.compareTo(o.make);
		return result;
	}

}
