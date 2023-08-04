package mainPackage;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// Part 1:
		//Instance or object of the class Person
		
		/*Person person = new Person("zabi aryan", 32, "California");
		
		System.out.println("Name:"+person.name+"\nAge:"+person.age+
				"\nAddress:"+person.address);*/
		
		// Part 2:
		// If we add multiple object of person it is time and space consuming
		// instead we use data structure ArrayList 
		/*ArrayList<Person> pList = new ArrayList<Person>();
		Person person1 = new Person("zabi aryan", 32, "California");
		Person person2 = new Person("aman tahir", 31, "California");
		Person person3 = new Person("hamay zahi", 30, "California");
		Person person4 = new Person("naweed maza",29, "California");
		pList.add(person1);
		pList.add(person2);
		pList.add(person3);
		pList.add(person4);
		for(Person p : pList) {
			System.out.println("-----------------");
			System.out.println("Name:"+p.name+"\nAge:"+p.age+
					"\nAddress:"+p.address);
		}
		// now we inherited Person class attributes and are able to print the values
		ArrayList<Student> sList = new ArrayList<Student>();
		Student student1 = new Student("zabi aryan", 32, "USA",2021,"CSC");
		Student student2 = new Student("aman tahir", 31, "USA",2022,"Physiccs");
		Student student3 = new Student("hamay zahi", 30, "USA", 2023,"History");
		
		sList.add(student1);
		sList.add(student2);
		sList.add(student3);  
	
		for(Person s : sList) {
			System.out.println("-----------------");
			System.out.println("Name:"+s.name+"\nAge:"+s.age+
					"\nAddress:"+s.address);
		}*/
		
		// Part 3:
		// now lets create a add function in Student class
		ArrayList<Student> sList = new ArrayList<Student>();
		sList.add(Student.addStudents("zabi", 30, "ca", 2021, "CSC"));
		sList.add(Student.addStudents("zab", 31, "Da", 20222, "MATH"));
		sList.add(Student.addStudents("zabi", 30, "KA", 2023, "PYS"));
		for(Person s : sList) {
			System.out.println("-----------------");
			System.out.println("Name:"+s.name+"\nAge:"+s.age+
					"\nAddress:"+s.address);
		}
	}


}
