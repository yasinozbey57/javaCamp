package javaHomework;

public class Instructor extends User {

	String name;
	String surname;
	int age;
	String information;
	
	
	public Instructor(int id, String name, String surname, int age, String information) {

		this.name=name;
		this.age = age;
		this.information = information;
		this.surname = surname;
	}
	
}
