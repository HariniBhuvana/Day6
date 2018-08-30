package com.harink.collections;

import java.util.Objects;

public class Television {
	
	
	private String company;
	private String type;
	private boolean ThreeDEnabled;
	private int price;
	public Television(String company, String type, boolean threeDEnabled, int price) {
		super();
		this.company = company;
		this.type = type;
		ThreeDEnabled = threeDEnabled;
		this.price = price;
	}
	public Television() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isThreeDEnabled() {
		return ThreeDEnabled;
	}
	public void setThreeDEnabled(boolean threeDEnabled) {
		ThreeDEnabled = threeDEnabled;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Television [company=" + company + ", type=" + type + ", ThreeDEnabled=" + ThreeDEnabled + ", price="
				+ price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(company,type,price);

	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
		return true;
		if(obj==null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		
		
		Television c2=(Television)obj;
		return this.company==c2.company && this.type==c2.type && this.price==c2.price;
		
		
	}
	
	

}
