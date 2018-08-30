package com.harink.collections;

public class Student implements Comparable<Student> {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name) {
		super();
		this.name = name;
	}

		@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

		@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

		@Override
		public int compareTo(Student o) {
			int result=this.name.compareTo(o.name);
		    
			return result;	
			
			
		}
		
		
	
	

}
