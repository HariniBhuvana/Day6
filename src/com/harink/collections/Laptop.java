package com.harink.collections;

import java.util.Objects;

public class Laptop {
	
	private String company;
	private String model;
	private String os;
	private String processor;
	public Laptop(String company, String model, String os, String processor) {
		super();
		this.company = company;
		this.model = model;
		this.os = os;
		this.processor = processor;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	@Override
	public String toString() {
		return "Laptop [company=" + company + ", model=" + model + ", os=" + os + ", processor=" + processor + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(company,model);

	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
		return true;
		if(obj==null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		
		
		Laptop c2=(Laptop)obj;
		return this.company==c2.company && this.model==c2.model;
	}
	
}
