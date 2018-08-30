package com.harink.collections.test;




import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.harink.collections.Student;

class CollectionQuestion4Test {

	@Test
	void testStudent() {
		Student student1= new Student("Dell");
		Student student2= new Student("HP");
		Student student3= new Student("Doll");
		TreeSet<Student>student=new TreeSet<>();
		student.add(student1);
		student.add(student2);
		student.add(student3);
		
        for(Student a: student) {
        	System.out.println(a);
        }
	

}
}
