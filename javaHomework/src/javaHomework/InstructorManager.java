package javaHomework;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println("E�itmen Eklendi"+" "+instructor.name+" "+instructor.surname);
	}
	
	public void delete(Instructor instructor) {
		System.out.println("E�itmen Silindi"+" "+instructor.name+" "+instructor.surname);
	}
	
	public void update(Instructor instructor) {
		System.out.println("E�itmen G�ncellendi"+" "+instructor.name+" "+instructor.surname);
	}
}
