package com.harink.collections.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
//import java.util.HashSet;

import org.junit.jupiter.api.Test;

import com.harink.collections.Car;
import com.harink.collections.CellPhone;
import com.harink.collections.Laptop;
import com.harink.collections.School;
import com.harink.collections.Television;

class CollectionQuestion1Test {

	@Test
	void testLaptopProducts() {
		ArrayList<Laptop>laptops=new ArrayList<>();
		//laptops.add(new Laptop("Dell","Inspiron5558","Windows8","i5"));
		assertEquals(true,laptops.add(new Laptop("Dell","Inspiron5558","Windows8","i5")));
		laptops.add(new Laptop("HP","HP234","Windows10","75"));
		laptops.add(new Laptop("Dell","Inspiron5558","Windows8","i5"));
        assertEquals(3,laptops.size());
        System.out.println(laptops);
	}
	@Test
	void testCarProducts() {
		ArrayList<Car>cars=new ArrayList<>();	
		assertEquals(true,cars.add(new Car("Swift","Dazler",2012,2500000)));
		cars.add(new Car("Maruti Suzuki","Alto",2008,400000));
		cars.add(new Car("Audi","A2",2015,5000000));
        assertEquals(3,cars.size());
        System.out.println(cars);
	}
	@Test
	void testCellPhoneProducts() {
		ArrayList<CellPhone>cellPhone=new ArrayList<>();	
		assertEquals(true,cellPhone.add(new CellPhone("Nokia","c20","fdsgv","Android",25000)));
		cellPhone.add(new CellPhone("Samsung","Galaxy s5","hgdhd","Linux",40000));
		cellPhone.add(new CellPhone("Redmi","Note 5","dgeyvc","Ubantu",15000));
        assertEquals(3,cellPhone.size());
        System.out.println(cellPhone);
	}
	@Test
	void testSchoolProducts() {
		ArrayList<School>school=new ArrayList<>();	
		assertEquals(true,school.add(new School("EHKN","MUMBAI","NAVIMUMBAI",2)));
		school.add(new School("KVB","CHENNAI","KOOVAM",4));
		school.add(new School("Government","ERODE","BHAVANI",15));
        assertEquals(3,school.size());
        System.out.println(school);
	}
	@Test
	void testTelevisionProducts() {
		ArrayList<Television>television=new ArrayList<>();	
		assertEquals(true,television.add(new Television("Redmi","LED",true,200000)));
		television.add(new Television("Samsung","LCD",true,400000));
		television.add(new Television("LG","LED",false,1500000));
        assertEquals(3,television.size());
        System.out.println(television);
	}


}
