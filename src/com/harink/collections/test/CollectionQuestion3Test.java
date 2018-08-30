package com.harink.collections.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.harink.collections.Student;

class CollectionQuestion3Test {

	@Test
	void testStudent() {
		Student student1= new Student("Dell");
		Student student2= new Student("HP");
		Student student3= new Student("Doll");
		ArrayList<Student>student=new ArrayList<>();
		student.add(student1);
		student.add(student2);
		student.add(student3);
		assertEquals(student1,student.get(0));
		assertEquals(student2,student.get(1));
		assertEquals(student3,student.get(2));
        for(Student a: student) {
        	System.out.println(a);
        }
	
		//System.out.println(student);
	
	}

}
