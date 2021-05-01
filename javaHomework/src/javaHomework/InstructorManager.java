package javaHomework;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println("Öðrenci Eklendi"+" "+instructor.name+" "+instructor.surname);
	}
	
	public void delete(Instructor instructor) {
		System.out.println("Öðrenci Silindi"+" "+instructor.name+" "+instructor.surname);
	}
	
	public void update(Instructor instructor) {
		System.out.println("Öðrenci Güncellendi"+" "+instructor.name+" "+instructor.surname);
	}
}
