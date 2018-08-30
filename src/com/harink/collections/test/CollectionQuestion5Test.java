package com.harink.collections.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.harink.collections.Car;

class CollectionQuestion5Test {

	@Test
	void testCar() {
		TreeSet<Car> carcollections =new TreeSet<>();
		assertEquals(true,carcollections.add(new Car("Swift","Dazler",2012,2500000)));
		assertEquals(true,carcollections.add(new Car("Maruti Suzuki","Alto",2008,400000)));
		assertEquals(true,carcollections.add(new Car("Audi","A2",2015,5000000)));
		 
		
		for(Car car: carcollections) {
			System.out.println(car);
		}
	}

}
