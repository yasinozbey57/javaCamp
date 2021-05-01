package javaHomework;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println("Eðitmen Eklendi"+" "+instructor.name+" "+instructor.surname);
	}
	
	public void delete(Instructor instructor) {
		System.out.println("Eðitmen Silindi"+" "+instructor.name+" "+instructor.surname);
	}
	
	public void update(Instructor instructor) {
		System.out.println("Eðitmen Güncellendi"+" "+instructor.name+" "+instructor.surname);
	}
}
