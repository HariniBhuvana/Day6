package com.harink.collections;

import java.util.Objects;

//import com.harink.collections.sample.Client.Comparator;

public class Camera implements Comparable<Camera>{
	private String model;
	private double price;
	
	private String brand;
	public Camera() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Camera(String model, double price, String brand) {
		super();
		this.model = model;
		this.price = price;
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Camera [model=" + model + ", price=" + price + ", brand=" + brand + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
		return true;
		if(obj==null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		
		
		Camera c2=(Camera)obj;
		return this.brand==c2.brand && this.model==c2.model && this.price==c2.price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(brand,price,model);
	}
	@Override
	//only one object can be compared at a time in this method.
	public int compareTo(Camera c2) {
		//int result= Double.compare(this.price,c2.price);(to compare by price,next line compare by brand)
		int result=this.brand.compareTo(c2.brand);
	    
		if(result==0)
		return this.model.compareTo(c2.model);
		return result;
		
		
		
		/* above function does this work
		 * double price1=this.price;
		double price2=this.price;
		if(price1<price2)
			return -1;
		if(price1>price2)
			return 1;
		else
		return 0;*/
	}
	/*Comparator <Camera>c=(c1,c2)-> {
		int result=Double.compare(c2.getPrice(),c1.getPrice());
		if(result==0)
			return c2.getModel().comapreToc1.getModel();
		return result;*/
	
}
