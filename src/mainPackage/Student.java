package mainPackage;

public class Student extends Person {

	public int gradYear;
	public String major;

	public Student(String name,int age,String address,int gradYear,String major) {
		super(name,age,address);
		this.gradYear = gradYear;
		this.major = major;
	}

	static Student addStudents(String name, int age,String address,int gradYear, String major){

		Student new_student = new Student(major, gradYear, major, gradYear, major);
		return new_student;

	}

}
