package javaHomework;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println("��renci Eklendi"+" "+instructor.name+" "+instructor.surname);
	}
	
	public void delete(Instructor instructor) {
		System.out.println("��renci Silindi"+" "+instructor.name+" "+instructor.surname);
	}
	
	public void update(Instructor instructor) {
		System.out.println("��renci G�ncellendi"+" "+instructor.name+" "+instructor.surname);
	}
}
